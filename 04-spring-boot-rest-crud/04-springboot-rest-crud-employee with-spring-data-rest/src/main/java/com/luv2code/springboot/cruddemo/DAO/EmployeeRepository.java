package com.luv2code.springboot.cruddemo.DAO;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "members") we can add like this for prefix
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // no need to write any code because  spring JPA implemented automatically
}
