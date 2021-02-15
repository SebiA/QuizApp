package com.example.quizapp.controller;

import com.example.quizapp.model.AllQuestions;

public class Score {

    public final int CORRECT_ANSWER = 10;
    public final int SKIP_QUESTION = -5;

    public int score;

    public Score() {
        score = 0;
    }

    AllQuestions allQs = new AllQuestions();

    public void correctAnswer() {
        score += CORRECT_ANSWER;
    }

    public void skipQuestion() {
        score += SKIP_QUESTION;
    }

    public int getScore() {
        return score;
    }
}
