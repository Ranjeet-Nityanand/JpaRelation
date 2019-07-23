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
		System.err.println("Course Reviews are->" + course.getReviews());
		Review review1 = new Review(5, "Great course");
		Review review2 = new Review(5, "nice course");
		course.addReview(review1);
		review1.setCourse(course);
		course.addReview(review2);
		review2.setCourse(course);
		// r.setCourse(course);
		// em.persist(r);
		// em.persist(review1);
		// em.persist(review2);
		System.err.println("Course with Review" + r);
	}

}
