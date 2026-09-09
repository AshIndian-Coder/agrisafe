package com.agro.trace.blockchain.service;

import java.math.BigInteger;

public interface BlockchainGateway {
    BlockchainTransactionReference createRequest(String productName, BigInteger quantity, String metadata);
    BlockchainTransactionReference deleteRequest(BigInteger requestId);
    BlockchainTransactionReference transferOwnership(BigInteger requestId, BigInteger productId, String newOwner);
    BlockchainTransactionReference recordAuthorityInspection(BigInteger productId, String result, String metadata);
    BlockchainTransactionReference recordManufacturerInspection(BigInteger productId, String result, String metadata);
    BlockchainTransactionReference recallProduct(BigInteger productId, String reason);
    Object[] getRequest(BigInteger requestId);
    Object[] getProduct(BigInteger productId);
    String getProductOwner(BigInteger productId);
}

record BlockchainTransactionReference(
        String transactionHash,
        String blockNumber,
        String status,
        String network
) {}
