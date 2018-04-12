package com.example.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HiService {
    @Resource
    EurekaClientFeign eurekaClientFeign;
    public String sqyHi(String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
