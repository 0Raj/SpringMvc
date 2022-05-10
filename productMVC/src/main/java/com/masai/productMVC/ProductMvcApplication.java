package com.masai.productMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.masai")
public class ProductMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductMvcApplication.class, args);
	}

}
