package com.cqc.hellospringboot.domain;

import java.io.Serializable;
import javax.persistence.*;

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

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return department_name
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * @return department_sn
     */
    public String getDepartmentSn() {
        return departmentSn;
    }

    /**
     * @param departmentSn
     */
    public void setDepartmentSn(String departmentSn) {
        this.departmentSn = departmentSn;
    }

    /**
     * @return post
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post
     */
    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", departmentName=").append(departmentName);
        sb.append(", departmentSn=").append(departmentSn);
        sb.append(", post=").append(post);
        sb.append("]");
        return sb.toString();
    }
}