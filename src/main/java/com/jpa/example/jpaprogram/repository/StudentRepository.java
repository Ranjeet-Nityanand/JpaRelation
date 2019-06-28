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
import com.jpa.example.jpaprogram.domain.Student;

/**
 * @author Ranjeet
 *
 */
@Repository
public class StudentRepository {
	@Autowired
	EntityManager em;

	Logger logger = LoggerFactory.getLogger(getClass());
	@Transactional
	public void saveStudent(Student student) {
		em.persist(student);
	}

	/**
	 * 
	 */
	@Transactional
	public Student findAllStudent(Integer id) {
		Student student = em.find(Student.class, id);
		Passport passport = student.getPassport();
		passport.setPassportNo("L25456");
		student.setName("Ranjeet Kumar");
		return student;
	}
	
	@Transactional
	public void SaveStudentWithPassport(Student student, Passport passport) {
		em.persist(passport);
		em.persist(student);
	}
}
