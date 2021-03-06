package com.example.controlLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Products;
import com.example.serviceLayer.ServiceLayer;

@Controller
@RestController
public class ControlInterface {
	
	@Autowired
	private ServiceLayer serviceLayer;
	
	@GetMapping(value="/getProducts")
	public List<Products> getProducts(){
		List<Products> productList = this.serviceLayer.getAllProducts();
		
		return productList;
	}
	
	@GetMapping(value = "/getProductsById/{productByID}")
	public Products getProductsById(@RequestParam Integer productID) {
		Products myProduct = null;
		int productByID = (int) productID;
		myProduct = this.getProductsById(productByID);
		
		return myProduct;
		
	}
	
	@PostMapping (value = "/addNewProduct")
	public String addNewProduct(@RequestBody Products product){
		
		if(this.serviceLayer.addNewProduct(product))
			return product.getProductName()+"added successfully";
		
		return product.getProductName()+"Not added successfully";
	}
	
	@DeleteMapping(value = "/deleteProduct")
	public String deleteProduct(@RequestParam Integer productId){
		
		int productById = (int) productId;
		
		if(this.serviceLayer.deleteProductByID(productById))
			return "deleted successfully";
		
		return "Not deleted";
	}
	
}
