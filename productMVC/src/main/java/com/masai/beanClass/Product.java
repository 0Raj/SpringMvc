package com.masai.beanClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productID;
	private String productName;
	private int productPrice;
	private String productBrand;
	private String productCategory;
	private int productRegistrationNumber;
	private int productManufacturerID;
	
	public Product() {
		
	}

	public Product( String productName, int productPrice, String productBrand, String productCategory,
			int productRegistrationNumber, int productManufacturerID) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.productCategory = productCategory;
		this.productRegistrationNumber = productRegistrationNumber;
		this.productManufacturerID = productManufacturerID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getProductRegistrationNumber() {
		return productRegistrationNumber;
	}

	public void setProductRegistrationNumber(int productRegistrationNumber) {
		this.productRegistrationNumber = productRegistrationNumber;
	}

	public int getProductManufacturerID() {
		return productManufacturerID;
	}

	public void setProductManufacturerID(int productManufacturerID) {
		this.productManufacturerID = productManufacturerID;
	}

	public int getProductID() {
		return productID;
	}
	
	

	
}
