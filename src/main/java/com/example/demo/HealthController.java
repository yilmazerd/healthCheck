package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthController {

    private static final String RESPONSE = "Success!\n";

    @GetMapping("/health")
    public String greeting() {
        return RESPONSE;
    }
}