package com.example.buttonsetlistener2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button loginButton,logoutButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginButton = findViewById(R.id.loginButtonId);
        logoutButton = findViewById(R.id.logoutButtonId);
        textView = findViewById(R.id.textViewId);

        Handler handler = new Handler();

        loginButton.setOnClickListener(handler);
        logoutButton.setOnClickListener(handler);


    }

    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if (view.getId()==R.id.loginButtonId){
                textView.setText("Login Button is Clicked.");
            }
            else if(view.getId()==R.id.logoutButtonId){
                textView.setText("Logout Button is Clicked.");

            }
        }
    }
}