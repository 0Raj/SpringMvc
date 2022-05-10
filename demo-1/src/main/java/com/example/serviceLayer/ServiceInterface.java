package com.example.serviceLayer;

import java.util.List;

import com.example.bean.Products;

public interface ServiceInterface {

	public List<Products> getAllProducts();
	public Products getProductByID(Integer productID);
	public boolean addNewProduct(Products product);
	public boolean deleteProductByID(Integer productID);
	public boolean updateProductByID(Integer productID);
}
