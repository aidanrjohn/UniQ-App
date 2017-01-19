package com.aidanrjohn.studentanswers;

/**
 * Created by ajohn_000 on 1/18/2017.
 */
public class Question {

    private String question;
    private int upvotes;
    private int answers;
    private String user;
    private String date;

    public Question(String question, int upvotes, int answers, String user, String date) {
        this.question = question;
        this.upvotes = upvotes;
        this.answers = answers;
        this.user = user;
        this.date = date;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getAnswers() {
        return answers;
    }

    public void setAnswers(int answers) {
        this.answers = answers;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
