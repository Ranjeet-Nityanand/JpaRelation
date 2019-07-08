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

import com.jpa.example.jpaprogram.domain.Course;
import com.jpa.example.jpaprogram.domain.Review;



/**
 * @author Ranjeet
 *
 */
@Repository
public class ReviewRepository {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	EntityManager em;
	/**
	 * @param r
	 */
	@Transactional
	public void saveReview(Review r) {
		em.persist(r);
	}

	/**
	 * @param course
	 * @param r
	 */
	@Transactional
	public void saveReviewWithCourse(Integer id, Review r) {
		Course course = em.find(Course.class, id);
		r.setCourse(course);
		em.persist(r);
		System.err.println("Course with Review" + r);
	}

}
