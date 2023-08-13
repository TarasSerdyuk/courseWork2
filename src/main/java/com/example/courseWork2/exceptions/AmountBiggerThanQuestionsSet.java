package com.example.courseWork2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AmountBiggerThanQuestionsSet extends RuntimeException{
    public AmountBiggerThanQuestionsSet() {
    }

    public AmountBiggerThanQuestionsSet(String message) {
        super(message);
    }

    public AmountBiggerThanQuestionsSet(String message, Throwable cause) {
        super(message, cause);
    }

    public AmountBiggerThanQuestionsSet(Throwable cause) {
        super(cause);
    }
}