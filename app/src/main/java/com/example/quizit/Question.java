package com.example.quizit;

public class Question {
    private int answerResId;
    private boolean trueAnswer;

    public Question(int answerResId, boolean trueAnswer) {
        this.answerResId = answerResId;
        this.trueAnswer = trueAnswer;
    }

    public int getAnswerResId() {
        return answerResId;
    }

    public void setAnswerResId(int answerResId) {
        this.answerResId = answerResId;
    }

    public boolean isTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(boolean trueAnswer) {
        this.trueAnswer = trueAnswer;
    }
}
