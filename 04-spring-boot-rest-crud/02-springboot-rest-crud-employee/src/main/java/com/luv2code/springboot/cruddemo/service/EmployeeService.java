package com.luv2code.springboot.cruddemo.service;


import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    public Employee findById(int id);

    // will be use for both save and update - > if id not exist save otherwise update by default value of id will be zero i.e if id zero add otherwise insert
    public Employee save(Employee theEmployee);

    public  void deleteById(int id);
}
