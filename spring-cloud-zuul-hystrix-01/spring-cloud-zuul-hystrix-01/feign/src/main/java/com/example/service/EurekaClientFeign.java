package com.example.service;

import com.example.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",configuration = FeignConfig.class)
public interface EurekaClientFeign {
    @GetMapping("/hi")
    String sayHiFromClientEureka(@RequestParam(value = "yangfan",required = false)String name);
}
