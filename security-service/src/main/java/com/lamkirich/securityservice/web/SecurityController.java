package com.lamkirich.securityservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SecurityController {

    @GetMapping("/testApi")
    public Map<String, Object> testApi(){
        return Map.of("massage", "Test Api");
    }
}
