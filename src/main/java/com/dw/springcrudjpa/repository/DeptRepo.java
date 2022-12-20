package com.dw.springcrudjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.springcrudjpa.model.Dept;

public interface DeptRepo extends JpaRepository<Dept, Long> {
    
}
