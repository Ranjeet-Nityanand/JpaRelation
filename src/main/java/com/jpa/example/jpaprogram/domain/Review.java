/****/package com.jpa.example.jpaprogram.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/***

@author Ranjeet
 *
 */

 @Entity
 @Table(name = "review")
 public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
 private Integer rating;
 private String description;

 public Review() {
 super();
 }

	public Review(Integer id, Integer rating, String description) {
		super();
		this.id = id;
		this.rating = rating;
		this.description = description;
 }

	public Review(Integer rating, String description) {
		super();
		this.rating = rating;
		this.description = description;
	}

	public Review(String description) {
		super();
		this.description = description;
	}

 public void setId(Integer id) {
 this.id = id;
 }

 public Integer getId() {
 return id;
 }

 public void setRating(Integer rating) {
 this.rating = rating;
 }

 public Integer getRating() {
 return rating;
 }

 public void setDescription(String description) {
 this.description = description;
 }

 public String getDescription() {
 return description;
 }

 @Override
 public String toString() {
		return "Review[Id=" + id + "Rating=" + rating + " Description=" + description + " ]\n";
 }
 }
