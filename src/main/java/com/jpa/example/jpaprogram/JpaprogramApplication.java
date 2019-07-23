package com.jpa.example.jpaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.example.jpaprogram.domain.Course;
import com.jpa.example.jpaprogram.domain.Employee;
import com.jpa.example.jpaprogram.domain.FullTimeEmployee;
import com.jpa.example.jpaprogram.domain.PartTimeEmployee;
import com.jpa.example.jpaprogram.domain.Passport;
import com.jpa.example.jpaprogram.domain.Review;
import com.jpa.example.jpaprogram.domain.Student;
import com.jpa.example.jpaprogram.repository.CourseRepository;
import com.jpa.example.jpaprogram.repository.EmployeeRepository;
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
	@Autowired
	EmployeeRepository employeeRepo;

	Logger logger = LoggerFactory.getLogger(getClass());
	public static void main(String[] args) {
		SpringApplication.run(JpaprogramApplication.class, args);
	}

	final int x = 0;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		Student stud = new Student("Rajiv Agrwal");
		Student student = new Student("Rakesh Kumar");
		Passport p = new Passport("B86783");
		// student.setPassport(p);
		logger.error("Value of Student" + student);
		// studentRepo.saveStudent(student);
		// studentRepo.SaveStudentWithPassport(student, p);
		Student student4 = studentRepo.findAllStudent(1);
		// logger.error("Value of Student" + student4);
		// logger.error("Fetched Data=" + student4);
		// logger.error("passport Details" + student4.getPassport());
		Course course = new Course("Micro Services");
		Course course1 = new Course("B-tech");
		Course course2 = new Course("MCA");
		Course course3 = new Course("BArch");
		logger.error("Course to save" + course);
		// courseRepo.saveCourse(course3);
		// passportRepo.savePassport(p3);
		Review r = new Review(3, "average");
		Review r1 = new Review(1, "bad");
		Review r2 = new Review(5, "excelent");
		Review r3 = new Review(4, "nice");
		// reviewRepo.saveReview(r3);
		// reviewRepo.saveReviewWithCourse(4, r3);
		// passportRepo.showPassport(21);
		// studentRepo.saveStudentWithCourse(student, course);
		// studentRepo.fetchStudentWithCourse(19);
		Employee employee1 = new FullTimeEmployee("Ranjeet Nityanand", 30000.00);
		Employee employee2 = new PartTimeEmployee("Kishori Lal", 500.00);
		Employee employee3 = new PartTimeEmployee("Manish Kumar", 50.00);
		// employeeRepo.saveEmployee(employee2);
		// employeeRepo.saveEmployee(employee3);
		logger.info("Employee data->{}", employeeRepo.fetchAllEmployee());

		final Employee e = new PartTimeEmployee("Raja");
		System.err.println(e.getName());
		e.setName("Ranjeet Nityanand");
		System.err.println(e.getName());
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> l2 = new ArrayList<>();
		final List<Integer> l3 = new ArrayList<>();
		l1.set(0, 9);
		l2.add(8);
		l2.add(10);
		l2.add(15);


		System.err.println(l2.toString());
		l1.forEach(a -> {
			// l2.add(0);
			// x++;
			// l2 = l1;
		});

		for (Integer integer : l2) {
			// l2.add(0);
			System.err.print(" " + integer);
		}
		// l2 = l3;
	}
}
