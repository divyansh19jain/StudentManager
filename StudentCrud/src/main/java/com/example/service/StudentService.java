package com.example.service;

import com.example.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);

    Student getStudentById(int id);
    Student updateStudent(Student student);
    void deleteStudentById(int id);

}
