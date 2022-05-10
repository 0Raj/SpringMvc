package com.example.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntityManager {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("productBase");
	
	public static EntityManager createMyEntityManager() {
		return emf.createEntityManager();
	}
}
