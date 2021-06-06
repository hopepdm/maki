package contract;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class Contracts_maki_router_sol_MakiswapRouter extends Contract {
    public static final String BINARY = "Bin file was not provided";

    public static final String FUNC_WHT = "WHT";

    public static final String FUNC_ADDLIQUIDITY = "addLiquidity";

    public static final String FUNC_ADDLIQUIDITYHT = "addLiquidityHT";

    public static final String FUNC_FACTORY = "factory";

    public static final String FUNC_GETAMOUNTIN = "getAmountIn";

    public static final String FUNC_GETAMOUNTOUT = "getAmountOut";

    public static final String FUNC_GETAMOUNTSIN = "getAmountsIn";

    public static final String FUNC_GETAMOUNTSOUT = "getAmountsOut";

    public static final String FUNC_QUOTE = "quote";

    public static final String FUNC_REMOVELIQUIDITY = "removeLiquidity";

    public static final String FUNC_REMOVELIQUIDITYHT = "removeLiquidityHT";

    public static final String FUNC_REMOVELIQUIDITYHTSUPPORTINGFEEONTRANSFERTOKENS = "removeLiquidityHTSupportingFeeOnTransferTokens";

    public static final String FUNC_REMOVELIQUIDITYHTWITHPERMIT = "removeLiquidityHTWithPermit";

    public static final String FUNC_REMOVELIQUIDITYHTWITHPERMITSUPPORTINGFEEONTRANSFERTOKENS = "removeLiquidityHTWithPermitSupportingFeeOnTransferTokens";

    public static final String FUNC_REMOVELIQUIDITYWITHPERMIT = "removeLiquidityWithPermit";

    public static final String FUNC_SWAPEXACTHTFORTOKENS = "swapExactHTForTokens";

    public static final String FUNC_SWAPEXACTHTFORTOKENSSUPPORTINGFEEONTRANSFERTOKENS = "swapExactHTForTokensSupportingFeeOnTransferTokens";

    public static final String FUNC_SWAPEXACTTOKENSFORHT = "swapExactTokensForHT";

    public static final String FUNC_SWAPEXACTTOKENSFORHTSUPPORTINGFEEONTRANSFERTOKENS = "swapExactTokensForHTSupportingFeeOnTransferTokens";

    public static final String FUNC_SWAPEXACTTOKENSFORTOKENS = "swapExactTokensForTokens";

    public static final String FUNC_SWAPEXACTTOKENSFORTOKENSSUPPORTINGFEEONTRANSFERTOKENS = "swapExactTokensForTokensSupportingFeeOnTransferTokens";

    public static final String FUNC_SWAPHTFOREXACTTOKENS = "swapHTForExactTokens";

    public static final String FUNC_SWAPTOKENSFOREXACTHT = "swapTokensForExactHT";

    public static final String FUNC_SWAPTOKENSFOREXACTTOKENS = "swapTokensForExactTokens";

    @Deprecated
    protected Contracts_maki_router_sol_MakiswapRouter(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Contracts_maki_router_sol_MakiswapRouter(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Contracts_maki_router_sol_MakiswapRouter(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Contracts_maki_router_sol_MakiswapRouter(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> WHT() {
        final Function function = new Function(FUNC_WHT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> addLiquidity(String tokenA, String tokenB, BigInteger amountADesired, BigInteger amountBDesired, BigInteger amountAMin, BigInteger amountBMin, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_ADDLIQUIDITY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, tokenA), 
                new org.web3j.abi.datatypes.Address(160, tokenB), 
                new org.web3j.abi.datatypes.generated.Uint256(amountADesired), 
                new org.web3j.abi.datatypes.generated.Uint256(amountBDesired), 
                new org.web3j.abi.datatypes.generated.Uint256(amountAMin), 
                new org.web3j.abi.datatypes.generated.Uint256(amountBMin), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> addLiquidityHT(String token, BigInteger amountTokenDesired, BigInteger amountTokenMin, BigInteger amountHTMin, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_ADDLIQUIDITYHT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, token), 
                new org.web3j.abi.datatypes.generated.Uint256(amountTokenDesired), 
                new org.web3j.abi.datatypes.generated.Uint256(amountTokenMin), 
                new org.web3j.abi.datatypes.generated.Uint256(amountHTMin), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, amountHTMin);
    }

    public RemoteFunctionCall<String> factory() {
        final Function function = new Function(FUNC_FACTORY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> getAmountIn(BigInteger amountOut, BigInteger reserveIn, BigInteger reserveOut) {
        final Function function = new Function(FUNC_GETAMOUNTIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountOut), 
                new org.web3j.abi.datatypes.generated.Uint256(reserveIn), 
                new org.web3j.abi.datatypes.generated.Uint256(reserveOut)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getAmountOut(BigInteger amountIn, BigInteger reserveIn, BigInteger reserveOut) {
        final Function function = new Function(FUNC_GETAMOUNTOUT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountIn), 
                new org.web3j.abi.datatypes.generated.Uint256(reserveIn), 
                new org.web3j.abi.datatypes.generated.Uint256(reserveOut)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<List> getAmountsIn(BigInteger amountOut, List<String> path) {
        final Function function = new Function(FUNC_GETAMOUNTSIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountOut), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(path, org.web3j.abi.datatypes.Address.class))), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<List> getAmountsOut(BigInteger amountIn, List<String> path) {
        final Function function = new Function(FUNC_GETAMOUNTSOUT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountIn), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(path, org.web3j.abi.datatypes.Address.class))), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> quote(BigInteger amountA, BigInteger reserveA, BigInteger reserveB) {
        final Function function = new Function(FUNC_QUOTE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountA), 
                new org.web3j.abi.datatypes.generated.Uint256(reserveA), 
                new org.web3j.abi.datatypes.generated.Uint256(reserveB)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> removeLiquidity(String tokenA, String tokenB, BigInteger liquidity, BigInteger amountAMin, BigInteger amountBMin, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_REMOVELIQUIDITY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, tokenA), 
                new org.web3j.abi.datatypes.Address(160, tokenB), 
                new org.web3j.abi.datatypes.generated.Uint256(liquidity), 
                new org.web3j.abi.datatypes.generated.Uint256(amountAMin), 
                new org.web3j.abi.datatypes.generated.Uint256(amountBMin), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> removeLiquidityHT(String token, BigInteger liquidity, BigInteger amountTokenMin, BigInteger amountHTMin, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_REMOVELIQUIDITYHT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, token), 
                new org.web3j.abi.datatypes.generated.Uint256(liquidity), 
                new org.web3j.abi.datatypes.generated.Uint256(amountTokenMin), 
                new org.web3j.abi.datatypes.generated.Uint256(amountHTMin), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> removeLiquidityHTSupportingFeeOnTransferTokens(String token, BigInteger liquidity, BigInteger amountTokenMin, BigInteger amountHTMin, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_REMOVELIQUIDITYHTSUPPORTINGFEEONTRANSFERTOKENS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, token), 
                new org.web3j.abi.datatypes.generated.Uint256(liquidity), 
                new org.web3j.abi.datatypes.generated.Uint256(amountTokenMin), 
                new org.web3j.abi.datatypes.generated.Uint256(amountHTMin), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> removeLiquidityHTWithPermit(String token, BigInteger liquidity, BigInteger amountTokenMin, BigInteger amountHTMin, String to, BigInteger deadline, Boolean approveMax, BigInteger v, byte[] r, byte[] s) {
        final Function function = new Function(
                FUNC_REMOVELIQUIDITYHTWITHPERMIT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, token), 
                new org.web3j.abi.datatypes.generated.Uint256(liquidity), 
                new org.web3j.abi.datatypes.generated.Uint256(amountTokenMin), 
                new org.web3j.abi.datatypes.generated.Uint256(amountHTMin), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline), 
                new org.web3j.abi.datatypes.Bool(approveMax), 
                new org.web3j.abi.datatypes.generated.Uint8(v), 
                new org.web3j.abi.datatypes.generated.Bytes32(r), 
                new org.web3j.abi.datatypes.generated.Bytes32(s)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> removeLiquidityHTWithPermitSupportingFeeOnTransferTokens(String token, BigInteger liquidity, BigInteger amountTokenMin, BigInteger amountHTMin, String to, BigInteger deadline, Boolean approveMax, BigInteger v, byte[] r, byte[] s) {
        final Function function = new Function(
                FUNC_REMOVELIQUIDITYHTWITHPERMITSUPPORTINGFEEONTRANSFERTOKENS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, token), 
                new org.web3j.abi.datatypes.generated.Uint256(liquidity), 
                new org.web3j.abi.datatypes.generated.Uint256(amountTokenMin), 
                new org.web3j.abi.datatypes.generated.Uint256(amountHTMin), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline), 
                new org.web3j.abi.datatypes.Bool(approveMax), 
                new org.web3j.abi.datatypes.generated.Uint8(v), 
                new org.web3j.abi.datatypes.generated.Bytes32(r), 
                new org.web3j.abi.datatypes.generated.Bytes32(s)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> removeLiquidityWithPermit(String tokenA, String tokenB, BigInteger liquidity, BigInteger amountAMin, BigInteger amountBMin, String to, BigInteger deadline, Boolean approveMax, BigInteger v, byte[] r, byte[] s) {
        final Function function = new Function(
                FUNC_REMOVELIQUIDITYWITHPERMIT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, tokenA), 
                new org.web3j.abi.datatypes.Address(160, tokenB), 
                new org.web3j.abi.datatypes.generated.Uint256(liquidity), 
                new org.web3j.abi.datatypes.generated.Uint256(amountAMin), 
                new org.web3j.abi.datatypes.generated.Uint256(amountBMin), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline), 
                new org.web3j.abi.datatypes.Bool(approveMax), 
                new org.web3j.abi.datatypes.generated.Uint8(v), 
                new org.web3j.abi.datatypes.generated.Bytes32(r), 
                new org.web3j.abi.datatypes.generated.Bytes32(s)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapExactHTForTokens(BigInteger amountOutMin, List<String> path, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_SWAPEXACTHTFORTOKENS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountOutMin), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(path, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapExactHTForTokensSupportingFeeOnTransferTokens(BigInteger amountOutMin, List<String> path, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_SWAPEXACTHTFORTOKENSSUPPORTINGFEEONTRANSFERTOKENS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountOutMin), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(path, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapExactTokensForHT(BigInteger amountIn, BigInteger amountOutMin, List<String> path, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_SWAPEXACTTOKENSFORHT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountIn), 
                new org.web3j.abi.datatypes.generated.Uint256(amountOutMin), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(path, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapExactTokensForHTSupportingFeeOnTransferTokens(BigInteger amountIn, BigInteger amountOutMin, List<String> path, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_SWAPEXACTTOKENSFORHTSUPPORTINGFEEONTRANSFERTOKENS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountIn), 
                new org.web3j.abi.datatypes.generated.Uint256(amountOutMin), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(path, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapExactTokensForTokens(BigInteger amountIn, BigInteger amountOutMin, List<String> path, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_SWAPEXACTTOKENSFORTOKENS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountIn), 
                new org.web3j.abi.datatypes.generated.Uint256(amountOutMin), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(path, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapExactTokensForTokensSupportingFeeOnTransferTokens(BigInteger amountIn, BigInteger amountOutMin, List<String> path, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_SWAPEXACTTOKENSFORTOKENSSUPPORTINGFEEONTRANSFERTOKENS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountIn), 
                new org.web3j.abi.datatypes.generated.Uint256(amountOutMin), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(path, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapHTForExactTokens(BigInteger amountOut, List<String> path, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_SWAPHTFOREXACTTOKENS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountOut), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(path, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapTokensForExactHT(BigInteger amountOut, BigInteger amountInMax, List<String> path, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_SWAPTOKENSFOREXACTHT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountOut), 
                new org.web3j.abi.datatypes.generated.Uint256(amountInMax), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(path, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> swapTokensForExactTokens(BigInteger amountOut, BigInteger amountInMax, List<String> path, String to, BigInteger deadline) {
        final Function function = new Function(
                FUNC_SWAPTOKENSFOREXACTTOKENS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountOut), 
                new org.web3j.abi.datatypes.generated.Uint256(amountInMax), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(path, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.Address(160, to), 
                new org.web3j.abi.datatypes.generated.Uint256(deadline)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Contracts_maki_router_sol_MakiswapRouter load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Contracts_maki_router_sol_MakiswapRouter(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Contracts_maki_router_sol_MakiswapRouter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Contracts_maki_router_sol_MakiswapRouter(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Contracts_maki_router_sol_MakiswapRouter load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Contracts_maki_router_sol_MakiswapRouter(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Contracts_maki_router_sol_MakiswapRouter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Contracts_maki_router_sol_MakiswapRouter(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
