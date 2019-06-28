/**
 * 
 */
package com.jpa.example.jpaprogram.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.example.jpaprogram.domain.Review;

/**
 * @author Ranjeet
 *
 */
@Repository
public class ReviewRepository {
	@Autowired
	EntityManager em;
	/**
	 * @param r
	 */
	@Transactional
	public void saveReview(Review r) {
		em.persist(r);
	}

}
