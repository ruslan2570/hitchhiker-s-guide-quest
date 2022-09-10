package com.example.klimov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        findViewById(R.id.btn_start).setOnClickListener((View) -> {
            Intent intent = new Intent(this, GameScreen.class);
            startActivity(intent);
        });
    }
}