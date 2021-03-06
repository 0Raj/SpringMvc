package com.masai.bootPractice.controlLayer;

import javax.persistence.EntityManager;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.bootPractice.util.MyEntity;

@RestController
public class Controller {

	@PostMapping(value="/addNewObject")
	public String addNewObject(@RequestBody Student std) {
		
		System.out.println(std);
		
		EntityManager em = MyEntity.provideEntityManager();
		em.getTransaction().begin();
		em.persist(std);
		em.getTransaction().commit();
		em.close();
		
		return "done...";
	}
}
