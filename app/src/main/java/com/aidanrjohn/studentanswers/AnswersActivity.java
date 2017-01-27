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

        TextView questionText = (TextView)findViewById(R.id.question_card_text);
        questionText.setText(question.getQuestion());

        TextView qUpvoteText = (TextView)findViewById(R.id.upvotes_text);
        qUpvoteText.setText(Integer.toString(question.getUpvotes()));

        TextView qUserText = (TextView)findViewById(R.id.user_text);
        qUserText.setText(question.getUser());

        TextView qDateText = (TextView)findViewById(R.id.date_text);
        qDateText.setText(question.getDate());
        // add divider to view
        View divider = getLayoutInflater().inflate(R.layout.divider, qLayout, false);
        qLayout.addView(divider);

        LinkedList<Answer> answers = question.getAnswers();

        for (Answer answer : answers) {
            int i = 1;

            LinearLayout aLayout = (LinearLayout)findViewById(R.id.question_card_container);
            View answerCard =  getLayoutInflater().inflate(R.layout.answer_card, aLayout, false);
            aLayout.addView(answerCard);
            answerCard.setId(i);

            TextView answerText = (TextView)findViewById(R.id.answer_card_text);
            answerText.setText(answer.getAnswer());
            answerText.setId(i);

            TextView upvoteText = (TextView)findViewById(R.id.answer_upvotes_text);
            upvoteText.setText(Integer.toString(answer.getUpvotes()));
            upvoteText.setId(i);

            TextView userText = (TextView)findViewById(R.id.answer_user_text);
            userText.setText(answer.getUser());
            userText.setId(i);

            TextView dateText = (TextView)findViewById(R.id.answer_date_text);
            dateText.setText(answer.getDate());
            dateText.setId(i);

            i++;

        }


    }

}
