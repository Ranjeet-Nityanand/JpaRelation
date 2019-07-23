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
public class PartTimeEmployee extends Employee {

	private Double hourlyWage;

	public PartTimeEmployee() {

	}

	public PartTimeEmployee(String name, Double hourlyWage) {
		super(name);
		this.hourlyWage = hourlyWage;
	}

	public PartTimeEmployee(String name) {
		super(name);
	}

	public Double getSalary() {
		return hourlyWage;
	}

	public void setSalary(Double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [name=" + super.getName() + ",  hourlyWage=" + hourlyWage + "]";
	}

}

