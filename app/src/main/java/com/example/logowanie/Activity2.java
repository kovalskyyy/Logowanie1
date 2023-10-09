package com.example.logowanie;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    private TextView textViewLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        textViewLogin = findViewById(R.id.textViewLogin);

        // Odbierz login przekazany z Activity1
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("login")) {
            String login = intent.getStringExtra("login");
            textViewLogin.setText("Login: " + login);
        }
    }
}
