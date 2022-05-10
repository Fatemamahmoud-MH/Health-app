package com.example.healthapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mood_recording;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mood_recording = findViewById(R.id.button);
        mood_recording.setOnClickListener(view -> openSurveyActivity());

    }
    public void openSurveyActivity(){
        Intent intentSurvey = new Intent(MainActivity.this,MoodRecording.class);
        startActivity(intentSurvey);
    }
}