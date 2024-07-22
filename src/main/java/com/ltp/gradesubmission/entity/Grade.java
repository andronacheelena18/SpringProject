package com.ltp.gradesubmission.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grades")
public class Grade {
    

    @Id
    @GeneratedValue
    @Column(name="id",nullable = false)
    private Long id;
    @Column(name="score", nullable = false)
    private String score;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}
