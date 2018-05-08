package com.fs.demo.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

	@Override
	public String sayHiFromClient(String name) {
		return "sorry, " + name;
	}
	
}
