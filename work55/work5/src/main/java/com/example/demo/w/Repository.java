package com.example.demo.w;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@org.springframework.stereotype.Repository
public class Repository{
	
	
	@PersistenceContext
	private EntityManager entityManager;
	public List<Cart> findAll() {
	javax.persistence.Query query = entityManager.createQuery("from Cart");
	return query.getResultList();
	}
	public  Cart findById(Integer id) {
	return entityManager.find( Cart.class, id); 
	
	}
}
