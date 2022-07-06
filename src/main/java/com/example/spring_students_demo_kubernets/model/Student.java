package com.example.spring_students_demo_kubernets.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "studenttest")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "hobby")
    private String hobby;

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
