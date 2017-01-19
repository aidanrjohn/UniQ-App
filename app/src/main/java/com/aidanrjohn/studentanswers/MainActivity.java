package com.aidanrjohn.studentanswers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    private String username;
    private EditText userText;
    private String url = "http://www.aidanrjohn.com/api/app/users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userText = (EditText)findViewById(R.id.username);
    }

    public void signupPressed(View v) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

    public void loginPressed(View v) {
        username = userText.getText().toString();
        if (username != null) {
            RequestQueue queue = Volley.newRequestQueue(this);
            StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.d("response", response);
                    startQuestions();
                }
            }, new Response.ErrorListener() {
                public void onErrorResponse(VolleyError error) {
                    Log.d("response", "Error!");
                }
            });
            queue.add(stringRequest);
        }
    }

    public void startQuestions() {
        Intent intent = new Intent(this, QuestionsActivity.class);
        startActivity(intent);
    }
}
