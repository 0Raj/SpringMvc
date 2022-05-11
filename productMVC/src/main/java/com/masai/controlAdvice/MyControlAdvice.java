package com.masai.controlAdvice;

import javax.management.RuntimeErrorException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.masai.exception.ProductNotFoundException;

@ControllerAdvice
public class MyControlAdvice extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleProductException(ProductNotFoundException productException){
		return new ResponseEntity<String>("The Product you entered not found", HttpStatus.NOT_FOUND);
		
	}
}
