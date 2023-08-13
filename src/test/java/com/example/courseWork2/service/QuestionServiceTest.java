package com.example.courseWork2.service;

import com.example.courseWork2.exceptions.QuestionAlreadyAddedException;
import com.example.courseWork2.exceptions.QuestionNotExistException;
import com.example.courseWork2.model.Question;
import com.example.courseWork2.repository.QuestionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class QuestionServiceTest {
    private QuestionService questionService;
    private QuestionRepository questionRepository;

    @BeforeEach
    private void setUp() {
        questionRepository = Mockito.mock(QuestionRepository.class);
        questionService = new QuestionServiceImpl(questionRepository);
    }

    @Test
    void shouldAddQuestionWhenItDoesntExist() {
        Question question = new Question("Question 5", "Answer 5");
        questionService.addQuestion(question);

        Assertions.assertTrue(questionService.getAllQuestions().contains(question));
    }

    @Test
    void shouldThrowExceptionWhenQuestionExists() {
        Question question = new Question("Question 1", "Answer 1");
        questionService.addQuestion(question);

        Assertions.assertThrows(QuestionAlreadyAddedException.class, () ->
                questionService.addQuestion(question));
    }

    @Test
    void shouldRemoveQuestionWhenExists() {
        Question question = new Question("Question 2", "Answer 2");
        questionService.addQuestion(question);
        questionService.removeQuestion(question);

        Assertions.assertTrue(!questionService.getAllQuestions().contains(question));
    }

    @Test
    void shouldThrowExceptionWhenQuestionDosntExist() {
        Assertions.assertThrows(QuestionNotExistException.class, () ->
                questionService.removeQuestion(new Question("Question 3", "Answer 3")));
    }
}