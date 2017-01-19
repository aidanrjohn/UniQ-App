package com.aidanrjohn.studentanswers;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.LinkedList;

public class QuestionsActivity extends Activity {

    private String url = "http://www.aidanrjohn.com/api/app/questions";
    private int numQuestions;
    private LinkedList<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        questions = new LinkedList<Question>();
        numQuestions = 3; // for testing purposes
        questions.add(new Question("What is your name?", 30, 2, "arj49", "1/18/17")); // test questions
        questions.add(new Question("What is your quest?", 31, 3, "arj50", "1/7/17")); // test questions
        questions.add(new Question("What is your favorite color?", 25, 6, "arj51", "1/6/17")); // test questions

        LinearLayout myLayout = (LinearLayout)findViewById(R.id.card_container);
        int i = 1;
        for (Question question : questions) { // add questions to screen
            View questionCard = getLayoutInflater().inflate(R.layout.question_card, myLayout, false);
            myLayout.addView(questionCard);
            questionCard.setId(i);

            TextView questionText = (TextView)findViewById(R.id.question_card_text);
            questionText.setText(question.getQuestion());

            TextView upvoteText = (TextView)findViewById(R.id.upvotes);
            upvoteText.setText(question.getUpvotes());

            TextView answerText = (TextView)findViewById(R.id.answers);
            answerText.setText(question.getAnswers());

            TextView userText = (TextView)findViewById(R.id.user);
            userText.setText(question.getUser());

            TextView dateText = (TextView)findViewById(R.id.date);
            upvoteText.setText(question.getDate());

            i++;
        }
    }

}
