package com.example.courseWork2.service;

import com.example.courseWork2.model.Question;

import java.util.Collection;

public interface QuestionService {
    //Question addQuestionAndAnswer(String question, String answer);

    Question addQuestion(Question question);

    Question removeQuestion(Question question);

    Collection<Question> getAllQuestions();

    Question getRandomQuestion();
}