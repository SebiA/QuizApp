package com.example.quizapp.model;

import com.example.quizapp.R;

public class AllQuestions {

    private int questionIndex;

    private Question[] allQuestions = {
            new Question(R.string.q_start,true),
            new Question(R.string.q_seas, false),
            new Question(R.string.q_continent, true),
            new Question(R.string.q_add3_4, true),
            new Question(R.string.q_add5_4, false),
            new Question(R.string.q_seasons, false),
            new Question(R.string.q_2x2, true),
            new Question(R.string.q_year, false)
};

public AllQuestions() {
        questionIndex = 0;
    }

public Question getQuestion(int index) {
        index = index % allQuestions.length;
        return allQuestions[index];
        }
}
