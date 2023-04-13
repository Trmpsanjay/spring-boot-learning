package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOimpl implements StudentDAO{


    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public StudentDAOimpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implements save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);

    }

    @Override
    public Student findById(int id){
       return  entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student",Student.class);
        return  theQuery.getResultList();
    }

    @Override
    public List<Student> findStudentByLastName(String lastName) {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student where lastName=:theData",Student.class);
        // set the query parameters
        theQuery.setParameter("theData",lastName);
        //return resultSet
        return  theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
        //
    }

    @Override
    @Transactional
    public  void delete(int id){
        Student theStudent = entityManager.find(Student.class,id);
        entityManager.remove(theStudent);

    }

}
