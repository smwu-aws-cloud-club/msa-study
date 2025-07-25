package com.example.gatewaytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Gateway-Test Service is running!";
    }

    @GetMapping("/health")
    public String health() {
        return "Gateway-Test is healthy!";
    }
}