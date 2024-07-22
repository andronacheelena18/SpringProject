package com.ltp.gradesubmission.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ltp.gradesubmission.entity.Student;

@Service
public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
}