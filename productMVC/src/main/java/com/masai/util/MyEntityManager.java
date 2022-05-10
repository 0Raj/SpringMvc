package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntityManager {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("productMVC");
	
	public static EntityManager provideEntity() {
		return emf.createEntityManager();
	}
}
