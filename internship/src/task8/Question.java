package com.task8;

import java.util.List;

class Question {
    String question;
    List<String> options;
    char correctAnswer;

    public Question(String question, List<String> options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean checkAnswer(char answer) {
        return Character.toUpperCase(answer) == Character.toUpperCase(correctAnswer);
    }
}