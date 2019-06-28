/**
 * 
 */
package com.jpa.example.jpaprogram.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.example.jpaprogram.domain.Course;

/**
 * @author Ranjeet
 *
 */
@Repository
public class CourseRepository {
	@Autowired
	EntityManager em;

	/**
	 * @param course
	 */
	@Transactional
	public void saveCourse(Course course) {
		em.persist(course);
	}

}
