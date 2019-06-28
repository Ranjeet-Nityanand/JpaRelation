/**
 * 
 */
package com.jpa.example.jpaprogram.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.example.jpaprogram.domain.Passport;

/**
 * @author Ranjeet
 *
 */
@Repository
public class PassportRepository {
	@Autowired
	EntityManager em;

	/**
	 * @param p
	 */
	@Transactional
	public void savePassport(Passport p) {
		em.persist(p);
	}

}
