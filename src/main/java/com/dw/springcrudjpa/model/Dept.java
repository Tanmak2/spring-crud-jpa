package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dw_dept")
public class Dept {
    @Id
    @Column(name = "dept_id")
    private long id;
    @Column
    private String name;
    @Column
    private String location;
    @Column
    private String startClassDate;
    @Column
    private String endClassDate;
    @Column
    private String teacher;
}
