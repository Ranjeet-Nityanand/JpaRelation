package com.jpa.example.jpaprogram;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.example.jpaprogram.domain.Course;
import com.jpa.example.jpaprogram.domain.Passport;
import com.jpa.example.jpaprogram.domain.Review;
import com.jpa.example.jpaprogram.domain.Student;
import com.jpa.example.jpaprogram.repository.CourseRepository;
import com.jpa.example.jpaprogram.repository.PassportRepository;
import com.jpa.example.jpaprogram.repository.ReviewRepository;
import com.jpa.example.jpaprogram.repository.StudentRepository;


@SpringBootApplication

public class JpaprogramApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepo;
	@Autowired
	CourseRepository courseRepo;
	@Autowired
	PassportRepository passportRepo;
	@Autowired
	ReviewRepository reviewRepo;

	Logger logger = LoggerFactory.getLogger(getClass());
	public static void main(String[] args) {
		SpringApplication.run(JpaprogramApplication.class, args);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		Student student = new Student("Manish");
		Passport p = new Passport("B86783");
		student.setPassport(p);
		logger.error("Value of Student" + student);
		// studentRepo.saveStudent(student);
		// studentRepo.SaveStudentWithPassport(student, p);
		Student student4 = studentRepo.findAllStudent(1);
		// logger.error("Fetched Data=" + student4);
		// logger.error("passport Details" + student4.getPassport());
		Course course = new Course("M-tech");
		Course course1 = new Course("B-tech");
		Course course2 = new Course("MCA");
		Course course3 = new Course("BCA");
		logger.error("Course to save" + course);
		// courseRepo.saveCourse(course3);
		// passportRepo.savePassport(p3);
		Review r = new Review(3, "average");
		Review r1 = new Review(1, "bad");
		Review r2 = new Review(5, "excelent");
		Review r3 = new Review(4, "nice");
		// reviewRepo.saveReview(r3);
	}
}
