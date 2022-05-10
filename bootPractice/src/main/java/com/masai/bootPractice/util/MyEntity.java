package com.masai.bootPractice.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntity {

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("bootPractice");
	
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
	
}
