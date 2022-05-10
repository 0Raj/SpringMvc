package com.masai.bootPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = "com.masai")
public class BootPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootPracticeApplication.class, args);
	}

}
