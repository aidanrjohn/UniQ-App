package com.aidanrjohn.studentanswers;

/**
 * Created by ajohn_000 on 1/23/2017.
 */
public class Answer {

    private String answer;
    private String user;
    private int upvotes;
    private String date;

    public Answer(String answer, String user, int upvotes, String date) {
        this.answer = answer;
        this.user = user;
        this.upvotes = upvotes;
        this.date = date;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
