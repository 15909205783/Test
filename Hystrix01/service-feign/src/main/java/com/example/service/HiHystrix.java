package com.example.service;


import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
