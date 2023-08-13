package com.example.courseWork2.service;

import com.example.courseWork2.model.Question;
import com.example.courseWork2.repository.QuestionRepository;
import com.example.courseWork2.repository.QuestionRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Service
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;
    private final Random random;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = new QuestionRepositoryImpl();
        this.random = new Random();
    }
    @Override
    public Question addQuestion(Question question) {
        return questionRepository.addQuestion(question);
    }

    @Override
    public Question removeQuestion(Question question) {
        return questionRepository.removeQuestion(question);
    }

    @Override
    public Collection<Question> getAllQuestions() {
        return questionRepository.getAllQuestions();
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> questionList = new ArrayList<>(questionRepository.getAllQuestions());
        int randomQuestionNumber = random.nextInt(questionList.size());
        return questionList.get(randomQuestionNumber);
    }
}