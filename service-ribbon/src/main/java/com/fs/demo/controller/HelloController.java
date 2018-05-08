package com.fs.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fs.demo.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hi(String name) {
		return helloService.hiService(name);
	}
	
	public void test() {
		Map<String, String> m = new HashMap<>();
	}
	
}
