package com.example.web;

import com.example.service.HiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {
    @Resource
    HiService hiService;
    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "yangfan",required = false)String name){
        return hiService.sqyHi(name);
    }
}
