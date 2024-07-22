package com.ltp.gradesubmission.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ltp.gradesubmission.entity.Course;

@Service
public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
    List<Course> getCourses();
}