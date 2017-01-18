package com.aidanrjohn.studentanswers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class SignupActivity extends AppCompatActivity {

    private String username;
    private String url = "http://www.aidanrjohn.com/api/app/users";
    private EditText userText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        userText = (EditText)findViewById(R.id.username);
    }

    public void createAccountPressed() {
        username = userText.getText().toString();
        if (username != null) {
            RequestQueue queue = Volley.newRequestQueue(this);
            StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.d("response", response);
                }
            }, new Response.ErrorListener() {
                public void onErrorResponse(VolleyError error) {
                    Log.d("response", "Error!");
                }
            });
            queue.add(stringRequest);
        }
    }


}
