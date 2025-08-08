package com.example.gateway.config;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import reactor.core.publisher.Mono;

@Configuration
public class GatewayConfig {

    @Bean
    @Order(-1)
    public GlobalFilter customGlobalFilter() {
        return (exchange, chain) -> {
            String path = exchange.getRequest().getPath().value();
            System.out.println("Gateway processing: " + path);

            return chain.filter(exchange.mutate()
                    .request(exchange.getRequest().mutate()
                            .header("X-Gateway", "Spring-Cloud-Gateway")
                            .header("X-Route-Source", "API-Gateway")
                            .build())
                    .build());
        };
    }
}