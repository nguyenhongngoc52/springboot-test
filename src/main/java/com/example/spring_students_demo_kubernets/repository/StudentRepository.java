package com.example.spring_students_demo_kubernets.repository;

import com.example.spring_students_demo_kubernets.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
