package com.example.spring_students_demo_kubernets.service;

import com.example.spring_students_demo_kubernets.model.Student;

import java.util.List;


public interface StudentService {
    List<Student> getAll();

    Student getStudenttbyId(Student student);

    void createStudent(Student student);

}
