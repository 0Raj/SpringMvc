package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.beanClass.Product;
import com.masai.exception.ProductNotFoundException;
import com.masai.service.ServiceLayer;

@RestController
@Controller
public class ControlLayer {
	
	@Autowired
	private ServiceLayer serviceLayer;

	@PostMapping(value="/addProduct")
	public String addProduct(@RequestBody Product product) {
		String res = "Not Added Successfully";
		
		if(this.serviceLayer.addProduct(product)) {
			return "Added Successfully";
		}
		
		return res;
		
	}
	
	@GetMapping(value="/getProducts")
	public List<Product> getProducts(){
		List<Product> productList = this.serviceLayer.getAllProducts();
		
		return productList;
	}
	
	@GetMapping(value = "/getProductsById")
	public Product getProductsById(@RequestParam Integer productID) throws ProductNotFoundException {
		Product myProduct = null;
		//System.out.println(productID);
		myProduct = this.serviceLayer.getProductByID(productID);
		
		return myProduct;
		
	}
	
	@DeleteMapping(value = "/deleteProduct")
	public String deleteProduct(@RequestParam Integer productId) throws ProductNotFoundException{
		
		
		
		if(this.serviceLayer.deleteProductByID(productId))
			return "deleted successfully";
		
		return "Not deleted";
	}
	
	
}

