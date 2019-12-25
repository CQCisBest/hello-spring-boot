package com.cqc.hellospringboot.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "person")
public class Person implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private String id;

    @Column(name = "`password`")
    private String password;

    @Column(name = "`name`")
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "department_sn")
    private String departmentSn;

    @Column(name = "post")
    private String post;

    private static final long serialVersionUID = 1L;
}