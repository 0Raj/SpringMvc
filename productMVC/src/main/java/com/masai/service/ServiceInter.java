package com.masai.service;

import java.util.List;


import com.masai.beanClass.Product;
import com.masai.exception.ProductNotFoundException;

public interface ServiceInter {
	public boolean addProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductByID(int productID) throws ProductNotFoundException;
	public boolean deleteProductByID(int productID) throws ProductNotFoundException;
	public boolean updateProductByID(int productID);
}
