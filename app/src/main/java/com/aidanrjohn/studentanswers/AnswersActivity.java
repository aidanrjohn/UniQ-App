package com.aidanrjohn.studentanswers;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.LinkedList;

public class AnswersActivity extends Activity {

    private Question question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);
        question = (Question)getIntent().getSerializableExtra("questionObj");
        LinearLayout qLayout = (LinearLayout)findViewById(R.id.question_card_container);
        // add question to view
        View questionCard = getLayoutInflater().inflate(R.layout.question_card, qLayout, false);
        qLayout.addView(questionCard);

        LinkedList<Answer> answers = question.getAnswers();

        for (Answer answer : answers) {

            LinearLayout aLayout = (LinearLayout)findViewById(R.id.answer_card_container);
            View answerCard =  getLayoutInflater().inflate(R.layout.answer_card, aLayout, false);
            aLayout.addView(answerCard);

            TextView answerText = (TextView)findViewById(R.id.answer_card_text);
            answerText.setText(answer.getAnswer());

            TextView upvoteText = (TextView)findViewById(R.id.answer_upvotes_text);
            upvoteText.setText(Integer.toString(answer.getUpvotes()));

            TextView userText = (TextView)findViewById(R.id.answer_user_text);
            userText.setText(answer.getUser());

            TextView dateText = (TextView)findViewById(R.id.answer_date_text);
            dateText.setText(answer.getDate());

        }

    }

}
