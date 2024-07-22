package com.ltp.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ltp.gradesubmission.entity.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student,Long>{

    
}