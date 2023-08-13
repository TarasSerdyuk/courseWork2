package com.example.courseWork2.repository;

import com.example.courseWork2.exceptions.QuestionAlreadyAddedException;
import com.example.courseWork2.exceptions.QuestionNotExistException;
import com.example.courseWork2.model.Question;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@Repository
public class QuestionRepositoryImpl implements QuestionRepository {
    private final Set<Question> questionSet;

    public QuestionRepositoryImpl() {
        this.questionSet = new HashSet<>();
    }

    @Override
    public Question addQuestion(Question question) {
        if (questionSet.contains(question)) {
            throw new QuestionAlreadyAddedException();
        }
        questionSet.add(question);
        return question;
    }

    @Override
    public Question removeQuestion(Question question) {
        if (!questionSet.contains(question)) {
            throw new QuestionNotExistException();
        }
        questionSet.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAllQuestions() {
        return Collections.unmodifiableSet(questionSet); // возращается копия сета, доступно только для чтения
    }
}