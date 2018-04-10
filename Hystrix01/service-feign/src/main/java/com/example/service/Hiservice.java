package com.example.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Hiservice {

    @Resource
    SchedualServiceHi schedualServiceHi;

    public String sayHi(String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
