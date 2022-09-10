package com.example.klimov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameScreen extends AppCompatActivity {

    Story story = new Story(this);
    TextView text;
    Button btn1, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);



        text = findViewById(R.id.tvStory);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setTransformationMethod(null);
        btn2.setTransformationMethod(null);
        btn3.setTransformationMethod(null);

        story.startingPoint();

    }

    public void button1(View view){
        story.selectPosition(story.nextPosition1);
    }
    public void button2(View view){
        story.selectPosition(story.nextPosition2);
    }
    public void button3(View view){
        story.selectPosition(story.nextPosition3);
    }
}