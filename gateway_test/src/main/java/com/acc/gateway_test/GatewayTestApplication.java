package com.acc.gateway_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayTestApplication.class, args);
    }
}

