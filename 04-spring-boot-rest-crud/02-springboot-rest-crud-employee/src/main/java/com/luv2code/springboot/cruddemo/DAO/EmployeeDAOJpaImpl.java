package com.luv2code.springboot.cruddemo.DAO;

import com.luv2code.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl  implements EmployeeDAO{


    EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        // create query

        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee",Employee.class);

        // execute query

        List<Employee> theEmployee = theQuery.getResultList();

        // return result
        return theEmployee;
    }

    @Override
    public Employee findById(int id) {
        Employee theEmployee = entityManager.find(Employee.class,id);
        return theEmployee;
    }

    // will be used for save as well as update -> if id exist then update otherwise save new record(by default value of id will be zero)  i.e if id zero add otherwise insert
    // Add @Transaction at service layer because it is standard practice
    @Override
    public Employee save(Employee theEmployee) {
        Employee dbEmployee = entityManager.merge(theEmployee); // because return updated if
        return dbEmployee;
    }

    @Override
    public void deleteById(int id) {

        // find the employee
        Employee theEmployee = entityManager.find(Employee.class,id);

        /// delete that found employee
        entityManager.remove(theEmployee);


    }
}
