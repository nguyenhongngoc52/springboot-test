package com.example.spring_students_demo_kubernets.service;

import com.example.spring_students_demo_kubernets.repository.StudentRepository;
import com.example.spring_students_demo_kubernets.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        List<Student> student_lts = new ArrayList<>();
        student_lts = studentRepository.findAll();
        return student_lts;
    }

    @Override
    public Student getStudenttbyId(Student student) {
        Optional<Student> student1 = studentRepository.findById(student.getId());
        Student student2 = student1.get();
        student2.setName(student.getName());
        student2.setAge(student.getAge());
        student2.setHobby(student.getHobby());
        studentRepository.save(student2);
        return student2;
    }

    @Override
    public void createStudent(Student student)  {
        studentRepository.save(student);
    }

}
