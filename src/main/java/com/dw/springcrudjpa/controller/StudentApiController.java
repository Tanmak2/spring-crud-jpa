package com.dw.springcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.model.Student;
import com.dw.springcrudjpa.repository.StudentRepo;

@RestController
public class StudentApiController {
    
    @Autowired
    StudentRepo studentReo;

    @GetMapping("/api/v1/student")
    public List<Student> callStudents(){
        return studentReo.findAll();
    }
}
