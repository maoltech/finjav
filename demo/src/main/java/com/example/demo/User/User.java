package com.example.demo.User;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )


    private Long id;
    private  String name;
    private LocalDate DOB;
    private String email;
    @Transient
    private Integer age;

    public User(){

    }


    public User(Long id,
                String name,
                String email,
                LocalDate DOB
                 ){
        this.id = id;
        this.name = name;
        this.email = email;
        this.DOB = DOB;


    }

    public User(String name,
                String email,
                LocalDate DOB
                ){
        this.name = name;
        this.email = email;
        this.DOB = DOB;
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

        return Period.between(this.DOB,  LocalDate.now()).getYears();
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
