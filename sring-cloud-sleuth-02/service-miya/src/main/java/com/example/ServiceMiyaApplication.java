package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class ServiceMiyaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMiyaApplication.class, args);
    }
    private static final Logger LOG = Logger.getLogger(ServiceMiyaApplication.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String home(){
        LOG.log(Level.INFO,"hi is being called");
        return "hi i'm miya111111111111111111669";
    }
    @RequestMapping("/miya")
    public String hello(){
        LOG.log(Level.INFO,"info is being called");
        return restTemplate.getForObject("http://localhost:8988/hello",String.class);
    }
    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
