package com.main.studentManagement.service;

import com.main.studentManagement.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student createStudent(Student student);

    Student updateStudent(Student student);
    Student getStudentById(Long id);

    void deleteStudentById(Long id);
}
