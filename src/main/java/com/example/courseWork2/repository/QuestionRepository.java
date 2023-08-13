package com.example.courseWork2.repository;

import com.example.courseWork2.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question addQuestion(Question question);
    Question removeQuestion(Question question);
    Collection<Question> getAllQuestions();
}