package com.rate_limiter.server_level.controller;

import com.rate_limiter.server_level.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @Autowired
    private SampleService service;

    @GetMapping("/first")
    public ResponseEntity<String> first(){
        String response = service.first();
        return ResponseEntity.ok(response);
    }
}
