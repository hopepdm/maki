package org.example;

import ch.qos.logback.classic.Level;
import contract.Contracts_maki_router_sol_IMakiswapPair;
import contract.Contracts_maki_router_sol_MakiswapRouter;
import contract.Contracts_maki_sol_MasterChef;
import contract.ERC20;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.LoggerFactory;
import org.web3j.abi.datatypes.Int;
import org.web3j.contracts.token.ERC20BasicInterface;
import org.web3j.contracts.token.ERC20Interface;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.http.HttpService;
import org.web3j.tuples.generated.Tuple3;
import org.web3j.tx.gas.StaticGasProvider;
import org.web3j.utils.Convert;
import org.web3j.utils.Convert.Unit;

/**
 * @author yasoolin
 * @version 1.0
 * @since 2021/6/6 1:29 下午
 */
@Slf4j
public class Harvest {

    public static Credentials credentials;

    public static Web3j web3j = null;

    public static String MASTER_ADDR = "0x4cb4c9c8cc67b171ce86eb947cf558afdbcab17e";

    public static String MAKI_ADDR = "0x5fad6fbba4bba686ba9b8052cf0bd51699f38b93";

    public static String MAKI_ROUTER = "0x7F88bC12aa1Ed9fF4605123649Ac90F2Cd9407eB";

    public static String LP_TOKEN = "0xc923e7dd24a96da2136cbc3c99f544f225a46424";

    public static Integer POOL = 1; //mdx-ht pool

    public static Contracts_maki_sol_MasterChef masterChef = null;

    public static ERC20 maki = null;

    public static Contracts_maki_router_sol_IMakiswapPair pair =  null;

    public static Contracts_maki_router_sol_MakiswapRouter router = null;

    public static Integer harvestIntervalInMinute = null;

    public static Boolean isRedeposit = true;

    public static void init() {
        ConfigManager configManager = null;
        try {
            configManager = new ConfigManager(true);
        } catch (ConfigurationException e) {
            log.error("加载配置文件出错");
        }
        harvestIntervalInMinute = configManager.getInteger("harvestIntervalInMinute");
        isRedeposit = configManager.getBoolean("isRedeposit");
        credentials = Credentials.create(configManager.getProperty("privateKey"));

        StaticGasProvider provider = new StaticGasProvider(
                Convert.toWei(BigDecimal.valueOf(1), Unit.GWEI).toBigInteger(), BigInteger.valueOf(210000));
        String url = "https://http-mainnet-node.huobichain.com";
        web3j = Web3j.build(new HttpService(url));
        masterChef = Contracts_maki_sol_MasterChef.load(
                MASTER_ADDR, web3j, credentials, provider
        );
        maki = ERC20.load(
                MAKI_ADDR, web3j, credentials, provider
        );
        router = Contracts_maki_router_sol_MakiswapRouter.load(
                MAKI_ROUTER, web3j, credentials, provider
        );
        pair = Contracts_maki_router_sol_IMakiswapPair.load(
                LP_TOKEN, web3j, credentials, provider
        );
    }


    public static void harvest() throws Exception {
        String harvest =
                masterChef.deposit(BigInteger.valueOf(POOL), BigInteger.ZERO).send().getTransactionHash();
        log.info("harvest: {}...", harvest);
    }

    public static void autoReDeposit() throws Exception {
        //1. 1/2的maki卖成ht组lp
        BigInteger amount = maki.balanceOf(credentials.getAddress()).send();
        BigInteger swapMakiAmount = amount.divide(BigInteger.valueOf(2L));
        sellMaki(swapMakiAmount);

        //2.组成lp
        BigInteger poolMakiAmount =  pair.getReserves().send().component2();
        amount = maki.balanceOf(credentials.getAddress()).send();

        BigInteger minHtAmount = new BigDecimal(router
                .quote(amount, poolMakiAmount, pair.getReserves().send().component1()).send())
                .toBigInteger();

        String addLiquidHash = router.addLiquidityHT(MAKI_ADDR, amount, amount,
                minHtAmount,
                credentials.getAddress(),
                new BigInteger("fffffffffffffffffffffffffffffffffffffffffffffffffff", 16)
                ).send().getTransactionHash();
        log.info("add liquid: {}...", addLiquidHash);

        //3.复投
        String depositHash = masterChef.deposit(BigInteger.valueOf(POOL), pair.balanceOf(credentials.getAddress()).send())
                .send().getTransactionHash();
        log.info("redeposit: {}...", depositHash);

    }

    public static String sellMaki(BigInteger swapMakiAmount) throws Exception {
        List<String> paths = Arrays.asList(
                "5fad6fbba4bba686ba9b8052cf0bd51699f38b93",
                "5545153ccfca01fbd7dd11c0b23ba694d9509a6f"
        );
        Tuple3<BigInteger, BigInteger, BigInteger> reverses = pair.getReserves().send();
        BigInteger requireHtAmount =
                new BigDecimal(
                        router.quote(swapMakiAmount, reverses.component2(), reverses.component1()).send()
                ).multiply(BigDecimal.valueOf(0.98))
                        .toBigInteger();
        String swapHash = router.swapExactTokensForHT(swapMakiAmount, requireHtAmount,
                paths,
                credentials.getAddress(),
                new BigInteger("fffffffffffffffffffffffffffffffffffffffffffffffffff", 16)
        ).send().getTransactionHash();
        log.info("swap maki for ht: {}...", swapHash);
        return swapHash;
    }

    public static void scheduleTask() {
        int i = 0;
        while (true) {
            try {
                log.info("loop id: {}", i);
                init();
                harvest();
                if (isRedeposit) {
                    autoReDeposit();
                } else {
                    sellMaki(maki.balanceOf(credentials.getAddress()).send());
                }
                Thread.sleep(1000 * 60 * harvestIntervalInMinute);
                i ++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws Exception {
        ch.qos.logback.classic.Logger rootLogger = (ch.qos.logback.classic.Logger)
                LoggerFactory.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME);
        rootLogger.setLevel(Level.toLevel("info"));
        init();
        scheduleTask();
    }




}
