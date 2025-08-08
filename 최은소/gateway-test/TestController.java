package com.example.gatewaytest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/test")
    public Map<String, Object> test(HttpServletRequest request) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello World");
        response.put("service", applicationName);
        response.put("port", port);
        response.put("timestamp", LocalDateTime.now());

        String gatewayHeader = request.getHeader("X-Gateway");
        String forwardedFor = request.getHeader("X-Forwarded-For");
        String forwardedHost = request.getHeader("X-Forwarded-Host");

        if (gatewayHeader != null) {
            response.put("via", "Spring Cloud Gateway");
            response.put("gateway_header", gatewayHeader);
        } else {
            response.put("via", "Direct Access");
        }

        response.put("request_from", request.getRemoteAddr());
        response.put("request_host", request.getHeader("Host"));

        if (forwardedFor != null) {
            response.put("forwarded_for", forwardedFor);
        }
        if (forwardedHost != null) {
            response.put("forwarded_host", forwardedHost);
        }

        return response;
    }
}