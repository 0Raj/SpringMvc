package com.example.repositoryLayer;

import java.util.List;

import com.example.bean.Products;

public interface RepositoryInterface {

	public List<Products> getAllProducts();
	public Products getProductByID(int productID);
	public boolean addNewProduct(Products product);
	public boolean deleteProductByID(int productID);
	public boolean updateProductByID(int productID);
}
