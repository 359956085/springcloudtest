package com.fs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fs.demo.service.SchedualServiceHi;

@RestController
public class HiController {
	
	@Autowired
	SchedualServiceHi schedualServiceHi;
	
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(String name) {
		return schedualServiceHi.sayHiFromClient(name);
	}
}