package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.dao.StudentDAOimpl;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO theStudentDAO){
		return runner ->{
//			createStudent(theStudentDAO);
//			createMultipleStudent(theStudentDAO);
			readStudentById(theStudentDAO);
			queryForStudents(theStudentDAO);
			queryForStudentsByLastName(theStudentDAO);
			updateStudent(theStudentDAO);
//			deleteStudent(theStudentDAO);

		};
	}

	private void deleteStudent(StudentDAO theStudentDAO) {
		//call the function and pass the id
		int id = 5;
		System.out.println("Deleteing student of id :"+id);
		theStudentDAO.delete(2);

	}

	private void updateStudent(StudentDAO theStudentDAO) {
		// create a student
		Student tempStudent1 = new Student("Ram","Kumar","ram@gmail.com");

		// save student
		theStudentDAO.save(tempStudent1);
		// update student
		tempStudent1.setEmail("ram123@gmail.com");
		theStudentDAO.update(tempStudent1);
		// display update on
		System.out.println(tempStudent1);
	}

	private void queryForStudentsByLastName(StudentDAO theStudentDAO) {
		// find the result of student
		List<Student> studentList = theStudentDAO.findStudentByLastName("Kumar");
		// display the result
		System.out.println("displaying student based on last name");
		for(int i=0;i<studentList.size();i++){
			System.out.println("Student "+i+" :"+studentList.get(i));
		}
	}

	private void queryForStudents(StudentDAO theStudentDAO) {
		List<Student> studentList = theStudentDAO.findAll();
		for(int i=0;i<studentList.size();i++){
			System.out.println("Student "+i+" :"+studentList.get(i));
		}
	}

	private void readStudentById(StudentDAO theStudent) {
		System.out.println("Finding student");
		Student tempStudent = theStudent.findById(5);
		System.out.println(tempStudent);

	}

	private void createMultipleStudent(StudentDAO theStudentDAO) {
		// create the multiple student
		Student tempStudent1 = new Student("Rakesh","Kumar","rakesh@gmail.com");
		Student tempStudent2 = new Student("RaJesh","Kumar","raJesh@gmail.com");
		Student tempStudent3 = new Student("Ramesh","Kumar","ramesh@gmail.com");



		// save the multiple student
		System.out.println("saving the students");
		theStudentDAO.save(tempStudent1);
		theStudentDAO.save(tempStudent2);
		theStudentDAO.save(tempStudent3);

		// show the ids
		System.out.println("Id for first student :"+tempStudent1.getId());
		System.out.println("Id for first student :"+tempStudent2.getId());
		System.out.println("Id for first student :"+tempStudent3.getId());
	}

	private void createStudent(StudentDAO theStudentDAO) {

		// create a student object
		System.out.println("Creating new student...");
		Student tempStudent = new Student("Sanjay","Kumar","trmpsanjay@gmail.com");


		// save the student object
		System.out.println("Saving the student :"+tempStudent);
		theStudentDAO.save(tempStudent);

		// display the student object id

		System.out.println("The saved student id :"+tempStudent.getId());

	}


}
