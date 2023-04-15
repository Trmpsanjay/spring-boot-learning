package com.luv2code.springboot.cruddemo.rest;


import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> findAll(){
        List<Employee> theEmployee = employeeService.findAll();
        return  theEmployee;
    }

    @GetMapping("/employee/{employeeId}")
    public  Employee getEmployee(@PathVariable int employeeId){
        Employee theEmployee = employeeService.findById(employeeId);
        if (theEmployee == null){
            throw new RuntimeException("Employeeid not found : "+employeeId);
        }
        return  theEmployee;
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        // set the id zero in case even they send id while adding
        System.out.println("inside add Employee");
        theEmployee.setId(0);;
        Employee dbEmployee = employeeService.save(theEmployee);
        return  dbEmployee;
    }
    @PutMapping("/employee")
    public  Employee updateEmployee(@RequestBody Employee theEmployee){

        Employee dbEmployee = employeeService.save(theEmployee);
        return  dbEmployee;
    }

    @DeleteMapping("/employee/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        // find the employee
        Employee theEmployee = employeeService.findById(employeeId);
        // delete employee
        if(theEmployee == null){
            throw  new RuntimeException("Employee id not found : "+employeeId);
        }
        employeeService.deleteById(employeeId);

        return  "deleted employeeId : "+employeeId;

    }
}
