package com.example.servicefeign.controller;

import com.example.servicefeign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hicontroller {

    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(String name) {
        return hiService.sayHiFromClient(name);
    }
}
