package com.example.serviceribbon.controller;

import com.example.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(String name){
        return helloService.hiService(name);
    }
}
