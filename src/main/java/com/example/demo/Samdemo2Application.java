package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Samdemo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Samdemo2Application.class, args);
		
		Alien obj = context.getBean(Alien.class);
		
		obj.code();
	}

}
