package com.m2i.teste;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.m2i.teste.entities.User;

/**
 * Session Bean implementation class UserEJB
 */
@Stateless(mappedName="userEJB")
@LocalBean

public class UserEJB {

	
	@PersistenceContext(unitName="TestE") private EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public UserEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public List<User> findAll() {
		List<User> users = this.entityManager.createNamedQuery("User.findAll").getResultList();
		for(User u:users) {
			System.out.println(u);
		}
		return users;
    }

}
