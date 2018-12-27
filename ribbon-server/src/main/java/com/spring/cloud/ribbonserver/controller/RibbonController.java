package com.spring.cloud.ribbonserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    //@HystrixCommand(fallbackMethod="fallbackMethod")
    public String sayHelloWorld() {
        String res = this.restTemplate.getForObject("http://service-client/auth/connect/" , String.class);
        return res;
    }
}
