package com.example.controlLayer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hello {
	@GetMapping("/hi")
	public String sayHello() {
	return "welcome"; // it will be represented as raw data.
	}
}
