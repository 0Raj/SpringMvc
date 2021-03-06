package com.example.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Products;
import com.example.repositoryLayer.Repository;

@Service
public class ServiceLayer implements ServiceInterface {
	
	@Autowired(required = true)
	private Repository repository;

	@Override
	public List<Products> getAllProducts() {
		
		return this.repository.getAllProducts();
	}

	@Override
	public Products getProductByID(Integer productID) {
		
		return this.repository.getProductByID(productID);
	}

	@Override
	public boolean addNewProduct(Products product) {
		
		return this.repository.addNewProduct(product);
	}

	@Override
	public boolean deleteProductByID(Integer productID) {
		
		return this.repository.deleteProductByID(productID);
	}

	@Override
	public boolean updateProductByID(Integer productID) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
