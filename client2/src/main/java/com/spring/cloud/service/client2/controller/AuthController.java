package com.spring.cloud.service.client2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chenlong1 on 2018/12/26.
 */
@RestController
@RequestMapping(value="auth",produces = "text/html;charset=UTF-8")
public class AuthController {
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping(value="connect")
    public String getConnect(){
        System.out.println("Success:2");
        return "Success:2";
    }
}
