package com.example.repositoryLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.example.bean.Products;
import com.example.util.MyEntityManager;

@org.springframework.stereotype.Repository
public class Repository implements RepositoryInterface {

	@Override
	public List<Products> getAllProducts() {
		List<Products> productList = null;

		EntityManager em = MyEntityManager.createMyEntityManager();

		String jpql = "Select a from Products a";

		TypedQuery<Products> myQuery = em.createQuery(jpql, Products.class);
		productList = myQuery.getResultList();

		em.close();
		return productList;
	}

	@Override
	public Products getProductByID(int productID) {

		Products myProduct = null;

		EntityManager em = MyEntityManager.createMyEntityManager();

		myProduct = em.find(Products.class, productID);

		em.close();
		return myProduct;
	}

	@Override
	public boolean addNewProduct(Products product) {
		boolean status = true;

		EntityManager em = MyEntityManager.createMyEntityManager();

		em.getTransaction().begin();
		em.persist(product);
		em.getTransaction().commit();

		em.close();

		return status;
	}

	@Override
	public boolean deleteProductByID(int productID) {
		boolean status = true;

		EntityManager em = MyEntityManager.createMyEntityManager();

		Products product = em.find(Products.class, productID);
		if (product != null) {
			em.getTransaction().begin();
			em.remove(product);
			em.getTransaction().commit();
		} else {
			status = false;
		}

		em.close();

		return status;
	}

	@Override
	public boolean updateProductByID(int productID) {
		// TODO Auto-generated method stub
		return false;
	}

}
