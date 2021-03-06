package com.example.presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = "com.example")
@SpringBootApplication
public class PresentationApplication {

	public static void main(String[] args) {
		ApplicationContext cts = SpringApplication.run(PresentationApplication.class, args);
		
	}
}
