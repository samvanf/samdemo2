package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	// We are NOT creating the object lap, it is being managed by Spring framework.
	@Autowired
	Laptop lap;
	
	public void code() {
		lap.compile();
	}
}
