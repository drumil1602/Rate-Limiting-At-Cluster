package com.rate_limiter.server_level.service.impl;

import com.rate_limiter.server_level.service.SampleService;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {
    @Override
    public String first() {
        return "This is First";
    }
}
