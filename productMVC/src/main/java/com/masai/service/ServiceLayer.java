package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.beanClass.Product;
import com.masai.repo.Repository;

@Service
public class ServiceLayer implements ServiceInter{
	
	@Autowired
	private Repository repository;

	@Override
	public boolean addProduct(Product product) {
		
		return this.repository.addProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return this.repository.getAllProducts();
	}

	@Override
	public Product getProductByID(int productID) {
		
		return this.repository.getProductByID(productID);
	}

	@Override
	public boolean deleteProductByID(int productID) {
		
		return this.repository.deleteProductByID(productID);
	}

	@Override
	public boolean updateProductByID(int productID) {
		// TODO Auto-generated method stub
		return false;
	}

}
