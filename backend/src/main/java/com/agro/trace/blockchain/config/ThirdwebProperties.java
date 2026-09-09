package com.agro.trace.blockchain.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.blockchain.thirdweb")
@Data
public class ThirdwebProperties {
    private String secretKey;
    private String walletAddress;
    private String contractAddress;
    private long chainId = 80002L;
    private String apiBaseUrl = "https://api.thirdweb.com/v1";
    private long pollIntervalMs = 1500L;
    private long pollTimeoutMs = 30000L;
}
