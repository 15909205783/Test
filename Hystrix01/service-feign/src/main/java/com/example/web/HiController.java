package com.example.web;

import com.example.service.Hiservice;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class HiController {
    @Resource
    Hiservice hiservice;
    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "forezp",required = false)String name){
        return hiservice.sayHi(name);
    }

}
