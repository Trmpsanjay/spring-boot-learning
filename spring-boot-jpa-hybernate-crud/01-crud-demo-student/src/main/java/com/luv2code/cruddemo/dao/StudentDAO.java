package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

import java.util.List;

// here is the class
public interface StudentDAO {

    void save(Student theStudent);
    Student findById(int id);

    List<Student> findAll();

    List<Student> findStudentByLastName(String lastName);
    void update(Student theStudent);

    void delete(int id);

}
