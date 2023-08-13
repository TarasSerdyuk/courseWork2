package com.example.courseWork2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class QuestionNotExistException extends RuntimeException {
    public QuestionNotExistException() {
    }

    public QuestionNotExistException(String message) {
        super(message);
    }

    public QuestionNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionNotExistException(Throwable cause) {
        super(cause);
    }
}