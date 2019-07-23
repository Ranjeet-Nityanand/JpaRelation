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

	@Transactional
	public Student findAllStudent(Integer id) {
		Student student = em.find(Student.class, id);
		Passport passport = student.getPassport();
		// passport.setPassportNo("L25456");
		student.setName("Ranjeet Kumar");
		logger.error("Student with passport=" + student);
		// logger.error("passport in student=" + passport.getStudent());
		return student;
	}
	
	@Transactional
	public void SaveStudentWithPassport(Student student, Passport passport) {
		// em.persist(passport);
		// em.persist(student);
		// logger.error("value of student and passport =" + student);
	}

	/**
	 * @param student
	 * @param course
	 */
	@Transactional
	public void saveStudentWithCourse(Student student, Course course) {
		em.persist(student);
		em.persist(course);

		student.addCourse(course);
		course.addStudent(student);
		em.persist(student);
		System.err.println("Student with Course=>" + student);
	}

	/**
	 * @param i
	 */
	/*
	 * public void fetchStudentWithCourse(int i) { em.f }
	 */
}
