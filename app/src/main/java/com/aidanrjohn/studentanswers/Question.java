package com.aidanrjohn.studentanswers;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Created by ajohn_000 on 1/18/2017.
 */
public class Question implements Serializable {

    private String question;
    private int upvotes;
    private int numAnswers;
    private String user;
    private String date;
    private LinkedList<Answer> answers;

    public Question(String question, int upvotes, int numAnswers, LinkedList<Answer> answers, String user, String date) {
        this.question = question;
        this.upvotes = upvotes;
        this.numAnswers = numAnswers;
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

    public LinkedList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(LinkedList<Answer> answers) {this.answers = answers;}

    public int getNumAnswers() {return numAnswers; }

    public void setNumAnswers(int numAnswers) { this.numAnswers = numAnswers; }

    public String getUser() {return user;}

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
