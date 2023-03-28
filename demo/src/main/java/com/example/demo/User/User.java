package com.example.demo.User;

import java.time.LocalDate;

public class User {
    private Long id;
    private  String name;
    private LocalDate DOB;
    private String email;
    private Integer age;

    public User(){

    }


    public User(Long id,
                String name,
                String email,
                LocalDate DOB,
                Integer age ){
        this.id = id;
        this.name = name;
        this.email = email;
        this.DOB = DOB;
        this.age = age;

    }

    public User(String name,
                String email,
                LocalDate DOB,
                Integer age ){
        this.name = name;
        this.email = email;
        this.DOB = DOB;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
