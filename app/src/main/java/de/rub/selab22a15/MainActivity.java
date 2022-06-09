package de.rub.selab22a15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mood_recording = findViewById(R.id.button);
        mood_recording.setOnClickListener(view -> openSurveyActivity());
        ///cancel button
        Button button_cancel = findViewById(R.id.buttonCancel);
        button_cancel.setOnClickListener(view -> {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        });

    }
    /////
    public void openSurveyActivity(){
        Intent intentSurvey = new Intent(MainActivity.this, de.rub.selab22a15.MoodRecording.class);
        startActivity(intentSurvey);
    }

}