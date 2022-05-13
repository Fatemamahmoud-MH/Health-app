package com.example.healthapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MoodRecording extends AppCompatActivity {

    SeekBar seekBarQuestion1;
    TextView textViewQuestion1;
    SeekBar seekBarQuestion2;
    TextView textViewQuestion2;
    SeekBar seekBarQuestion3;
    TextView textViewQuestion3;
    SeekBar seekBarQuestion4;
    TextView textViewQuestion4;
    SeekBar seekBarQuestion5;
    TextView textViewQuestion5;
    SeekBar seekBarQuestion6;
    TextView textViewQuestion6;
    //cancel
    Button   backToHomePageFromMoodRecording ;
    //next event
    Button buttonNextEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_recording);
        ////this is for ,when we finish  mood recording and i want to go back to homepage.
        backToHomePageFromMoodRecording = findViewById(R.id.buttonBack);
        backToHomePageFromMoodRecording.setOnClickListener(view -> ClickToReturnHomePage());
        ///next to Event appraisal
        buttonNextEvent = findViewById(R.id.buttonNext);
        buttonNextEvent.setOnClickListener(view -> ClickNextTOEventMood());



        /////these are for Mood recording
        seekBarQuestion1 = findViewById(R.id.seekBar1);
        textViewQuestion1 = findViewById(R.id.textView5);
        seekBarQuestion2 = findViewById(R.id.seekBar2);
        textViewQuestion2 = findViewById(R.id.textView8);
        seekBarQuestion3 = findViewById(R.id.seekBar3);
        textViewQuestion3 = findViewById(R.id.textView10);
        seekBarQuestion4 = findViewById(R.id.seekBar4);
        textViewQuestion4 = findViewById(R.id.textView12);
        seekBarQuestion5 = findViewById(R.id.seekBar5);
        textViewQuestion5 = findViewById(R.id.textView14);
        seekBarQuestion6 = findViewById(R.id.seekBar);
        textViewQuestion6 = findViewById(R.id.textView19);


        seekBarQuestion1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressQuestion1, boolean b) {
                if(progressQuestion1<= 50){
                    textViewQuestion1.setText("zufrieden "+ progressQuestion1 + "%");
                }
                else {
                    textViewQuestion1.setText("unzufrieden "+ progressQuestion1 + "%");
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                seekBar.setProgress(1);

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarQuestion2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressQuestion2, boolean b) {
                if(progressQuestion2<= 50){
                    textViewQuestion2.setText("ruhig " + progressQuestion2 + "%");
                }
                else{
                    textViewQuestion2.setText("unruhig " + progressQuestion2 + "%");
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarQuestion3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressQuestion3, boolean b) {
                if(progressQuestion3 <= 50){
                    textViewQuestion3.setText("wohl " + progressQuestion3 + "%");
                }
                else{
                    textViewQuestion3.setText("unwohl " + progressQuestion3 + "%");
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarQuestion4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressQuestion4, boolean b) {
                if(progressQuestion4<= 50){
                    textViewQuestion4.setText("entspannt " + progressQuestion4 + "%");
                }
                else{
                    textViewQuestion4.setText("angespannt " + progressQuestion4 + "%");
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBarQuestion5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressQuestion5, boolean b) {
                if(progressQuestion5 <= 50){
                   textViewQuestion5.setText("energiegelanden " + progressQuestion5 + "%");
                }
                else {
                    textViewQuestion5.setText("energielos " + progressQuestion5 + "%");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBarQuestion6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressQuestion6, boolean b) {
                if(progressQuestion6 <= 50){
                    textViewQuestion6.setText("wach " + progressQuestion6 + "%");
                }
                else{
                    textViewQuestion6.setText("müde " + progressQuestion6 + "%");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    public void ClickToReturnHomePage(){
        Intent intentHomePage = new Intent(MoodRecording.this,MainActivity.class);
        startActivity(intentHomePage);
    }
    public  void ClickNextTOEventMood(){
        Intent intentEvent = new Intent(MoodRecording.this,EventAppraisal.class);
        startActivity(intentEvent);
    }
}
