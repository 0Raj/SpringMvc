package com.masai.service;

import java.util.List;


import com.masai.beanClass.Product;

public interface ServiceInter {
	public boolean addProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductByID(int productID);
	public boolean deleteProductByID(int productID);
	public boolean updateProductByID(int productID);
}