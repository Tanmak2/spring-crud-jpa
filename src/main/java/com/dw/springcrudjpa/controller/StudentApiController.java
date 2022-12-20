package com.dw.springcrudjpa.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.model.Student;
import com.dw.springcrudjpa.repository.StudentRepo;

@RestController
public class StudentApiController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/api/v1/student")
    public List<Student> callStudents() {
        return studentRepo.findAll();
    }

    @GetMapping("/api/v1/student/{id}")
    public Student studentDetail(@PathVariable long id) {
        return studentRepo.findById(id).get();
    }

    @PostMapping("/api/v1/student")
    public Student insertStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @PatchMapping("/api/v1/student")
    public Student updateStudent(@RequestBody Student student) {
        student = studentRepo.save(student);
        return student;
    }

    @DeleteMapping("/api/v1/student/{id}")
    public boolean deleteStudent(@PathVariable long id) {
        try {
            studentRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
