package com.example.courseWork2.service;

import com.example.courseWork2.model.Question;

import java.util.Set;

public interface ExaminerService {
    Set<Question> getQuestions(Integer amount);
}