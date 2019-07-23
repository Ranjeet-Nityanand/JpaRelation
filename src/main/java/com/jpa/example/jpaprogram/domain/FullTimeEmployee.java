/**
 * 
 */
package com.jpa.example.jpaprogram.domain;

import javax.persistence.Entity;

/**
 * @author Ranjeet
 *
 */
@Entity
public class FullTimeEmployee extends Employee {

	private Double salary;

	public FullTimeEmployee() {

	}

	public FullTimeEmployee(String name, Double salary) {
		super(name);
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [name=" + super.getName() + ",  salary=" + salary + "]";
	}

}

