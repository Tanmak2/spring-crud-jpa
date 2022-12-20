package com.dw.springcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.model.Dept;
import com.dw.springcrudjpa.repository.DeptRepo;

@RestController
public class DeptApiController {

    @Autowired
    DeptRepo deptRepo;

    @GetMapping("/api/v1/dept")
    public List<Dept> callDept() {
        return deptRepo.findAll();
    }

    @GetMapping("/api/v1/dept/{id}")
    public Dept deptDetail(@PathVariable long id) {
        return deptRepo.findById(id).get();
    }

    @PostMapping("/api/v1/dept")
    public Dept insertStudent(@RequestBody Dept dept) {
        return deptRepo.save(dept);
    }

    @PatchMapping("/api/v1/dept")
    public Dept updateStudent(@RequestBody Dept dept) {
        dept = deptRepo.save(dept);
        return dept;
    }

    @DeleteMapping("/api/v1/dept/{id}")
    public boolean deleteStudent(@PathVariable long id) {
        try {
            deptRepo.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
