/**
 * 
 */
package com.jpa.example.jpaprogram.repository;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	EntityManager em;

	/**
	 * @param p
	 */
	@Transactional
	public void savePassport(Passport p) {
		em.persist(p);
	}

	/**
	 * @param id
	 */
	@Transactional
	public void showPassport(int id) {
		Passport passport = em.find(Passport.class, id);
		// System.err.println(passport);
		logger.info("" + passport);

	}

}
