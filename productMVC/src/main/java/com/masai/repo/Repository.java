package com.masai.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.beanClass.Product;
import com.masai.exception.ProductNotFoundException;
import com.masai.util.MyEntityManager;

@org.springframework.stereotype.Repository
public class Repository implements RepositoryInter {

	@Override
	public boolean addProduct(Product product) {
		boolean res = false;
		EntityManager em = MyEntityManager.provideEntity();

		if (product != null) {
			em.getTransaction().begin();
			em.persist(product);
			em.getTransaction().commit();
			res = true;
		}

		em.close();
		return res;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> productList = null;

		EntityManager em = MyEntityManager.provideEntity();

		String jpql = "Select a from Product a";

		TypedQuery<Product> myQuery = em.createQuery(jpql, Product.class);
		productList = myQuery.getResultList();

		em.close();
		return productList;
	}

	@Override
	public Product getProductByID(int productID) throws ProductNotFoundException{
		Product myProduct = null;

		EntityManager em = MyEntityManager.provideEntity();

		myProduct = em.find(Product.class, productID);
		
		if(myProduct == null) {
			throw new ProductNotFoundException("Given product Id not found");
		}else {
			em.close();
			return myProduct;
		}

		
		
	}

	@Override
	public boolean deleteProductByID(int productID) throws ProductNotFoundException{
		boolean status = true;

		EntityManager em = MyEntityManager.provideEntity();

		Product product = em.find(Product.class, productID);
		if (product != null) {
			em.getTransaction().begin();
			em.remove(product);
			em.getTransaction().commit();
			
			em.close();
			
			return status;
		} else {	
			throw new ProductNotFoundException("Given product Id not found");
		}

		

		
	}

	@Override
	public boolean updateProductByID(int productID) {
		// TODO Auto-generated method stub
		return false;
	}

}
