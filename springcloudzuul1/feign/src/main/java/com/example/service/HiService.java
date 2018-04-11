package com.example.service;

import com.example.config.EurekaClientFeign;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HiService {
    @Resource
    EurekaClientFeign eurekaClientFeign;
    public String sayHi(String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
