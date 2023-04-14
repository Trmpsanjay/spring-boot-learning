package com.luv2code.demo.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandling {


    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
        // create studenterrorresponse and set value and return
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        return  new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

    // handling default exception

    public  ResponseEntity<StudentErrorResponse> handleException(Exception exc){
        // create studenterrorresponse and set value and return
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        return  new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);

    }
}