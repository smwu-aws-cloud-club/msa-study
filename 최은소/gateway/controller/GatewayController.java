package com.example.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GatewayController {

    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> response = new HashMap<>();
        response.put("service", "GATEWAY");
        response.put("status", "UP");
        response.put("timestamp", LocalDateTime.now());
        response.put("message", "Spring Cloud Gateway is running!");
        response.put("routes", new String[]{"/test", "/health", "/info"});
        return response;
    }

    @GetMapping("/gateway/status")
    public Map<String, Object> status() {
        Map<String, Object> response = new HashMap<>();
        response.put("gateway", "RUNNING");
        response.put("eureka", "CONNECTED");
        response.put("routes", "ACTIVE");
        response.put("loadBalancer", "ENABLED");
        return response;
    }

    @GetMapping("/gateway/routes")
    public Map<String, Object> routes() {
        Map<String, Object> response = new HashMap<>();
        response.put("gateway_port", "8080");
        response.put("target_service", "GATEWAY-TEST");
        response.put("target_port", "8081");
        response.put("routing_path", "/test -> lb://GATEWAY-TEST/test");
        response.put("message", "Request will be forwarded to GATEWAY-TEST service");
        return response;
    }
}