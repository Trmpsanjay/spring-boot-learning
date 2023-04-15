package com.luv2code.springboot.cruddemo.DAO;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // no need to write any code because  spring JPA implemented automatically
}
