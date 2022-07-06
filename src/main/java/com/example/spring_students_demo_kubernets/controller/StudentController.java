package com.example.spring_students_demo_kubernets.controller;


import com.example.spring_students_demo_kubernets.service.StudentService;
import com.example.spring_students_demo_kubernets.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService ;

    @GetMapping("/getAll-student")
    public ResponseEntity<List<Student>> getAll(){
        List<Student> list = new ArrayList<>();
        list = studentService.getAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/create-student")
    public ResponseEntity<String> create(@RequestBody Student student){
        studentService.createStudent(student);
        return new ResponseEntity<>("them thanh cong" , HttpStatus.OK);
    }

    @PutMapping("/update-student")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
       Student student1 =  studentService.getStudenttbyId(student);
       return new ResponseEntity<>(student1,HttpStatus.OK);
    }
}




















