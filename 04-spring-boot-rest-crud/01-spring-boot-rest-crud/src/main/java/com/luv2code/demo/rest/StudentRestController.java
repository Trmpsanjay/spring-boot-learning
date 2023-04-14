package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Sanjay","Kumar"));
        theStudents.add(new Student("Rakesh","Kumar"));
        theStudents.add(new Student("Ramesh","Kumar"));

    }


    @GetMapping("/students")
    public List<Student>  getStudents(){

        return  theStudents;
    }

    // Defining pathvariable which will return student at that index
    @GetMapping("/students/{studentId}")
    public  Student getStudentById(@PathVariable int studentId){
        System.out.println("Inside getStudentById");
        if(studentId <0 || studentId > theStudents.size()){
            throw  new StudentNotFoundException("Student not found of given id :"+studentId);
        }
        return  theStudents.get(studentId);
    }
}
