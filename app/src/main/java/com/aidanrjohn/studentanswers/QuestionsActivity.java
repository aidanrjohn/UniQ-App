package com.aidanrjohn.studentanswers;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;
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
        LinkedList<Answer> answers1 = new LinkedList<Answer>();
        answers1.add(new Answer("Glub", "arj50", 12, "1/18/17"));
        questions.add(new Question("What is your name?", 30, 2, answers1, "arj49", "1/18/17")); // test questions
        questions.add(new Question("What is your quest?", 31, 3, answers1, "arj50", "1/7/17")); // test questions
        questions.add(new Question("What is your favorite color?", 25, 6, answers1,  "arj51", "1/6/17")); // test questions

        LinearLayout myLayout = (LinearLayout)findViewById(R.id.card_container);
        int i = 1;
        for (Question question : questions) { // add questions to screen
            View questionCard = getLayoutInflater().inflate(R.layout.question_card, myLayout, false);
            myLayout.addView(questionCard);
            questionCard.setId(i);

            TextView questionText = (TextView)findViewById(R.id.question_card_text);
            questionText.setText(question.getQuestion());
            questionText.setId(i);

            TextView upvoteText = (TextView)findViewById(R.id.upvotes_text);
            upvoteText.setText(Integer.toString(question.getUpvotes()));
            upvoteText.setId(i);

            TextView answerText = (TextView)findViewById(R.id.answers_text);
            answerText.setText(Integer.toString(question.getNumAnswers()) + " answers");
            answerText.setId(i);

            TextView userText = (TextView)findViewById(R.id.user_text);
            userText.setText(question.getUser());
            userText.setId(i);

            TextView dateText = (TextView)findViewById(R.id.date_text);
            dateText.setText(question.getDate());
            dateText.setId(i);

            i++;
        }


    }

    public void questionCardPressed(View v) {
        int index = v.getId();
        Question question = questions.get(index - 1);
        Intent intent = new Intent(this, AnswersActivity.class);
        intent.putExtra("questionObj", question);
        startActivity(intent);
    }

}
