package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // Route to gateway-test service
                .route("gateway-test-route", r -> r
                        .path("/test/**")
                        .uri("lb://GATEWAY-TEST"))

                // Route for health check
                .route("gateway-test-health", r -> r
                        .path("/health/**")
                        .uri("lb://GATEWAY-TEST"))

                // Route for info endpoint
                .route("gateway-test-info", r -> r
                        .path("/info/**")
                        .uri("lb://GATEWAY-TEST"))

                .build();
    }
}