package com.example.logintest2.mainexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.example.logintest2.filter.*"})
public class SpringMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final ConfigurableApplicationContext 
		configurableApplicationContext = SpringApplication.run(SpringMainExample.class, args);
	}

}
