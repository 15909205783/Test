package com.example.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi(@RequestParam(defaultValue = "yangfan", required = false) String name) {
        return "hi" + name + ",I am from port:" + port;
    }
}
