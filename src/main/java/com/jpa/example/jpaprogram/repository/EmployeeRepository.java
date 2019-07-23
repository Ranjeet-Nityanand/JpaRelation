/**
 * 
 */
package com.jpa.example.jpaprogram.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.example.jpaprogram.domain.Employee;

/**
 * @author Ranjeet
 *
 */
@Repository
public class EmployeeRepository {

	@Autowired
	EntityManager em;
	Logger logger = LoggerFactory.getLogger(getClass());

	@Transactional
	public void saveEmployee(Employee employee) {
		em.persist(employee);
	}
	public List<Employee> fetchAllEmployee() {
		return em.createQuery("select e from Employee e", Employee.class).getResultList();
	}
}

