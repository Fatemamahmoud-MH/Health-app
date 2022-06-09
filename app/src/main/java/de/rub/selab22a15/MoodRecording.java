package de.rub.selab22a15;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MoodRecording extends AppCompatActivity {

    private TextView textViewQuestion1;
    private TextView textViewQuestion2;
    private TextView textViewQuestion3;
    private TextView textViewQuestion4;
    private TextView textViewQuestion5;
    private TextView textViewQuestion6;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_recording);
        ////this is for ,when we finish  mood recording and i want to go back to homepage.
        //cancel
        ImageView backToHomePageFromMoodRecording = findViewById(R.id.back2);
        backToHomePageFromMoodRecording.setOnClickListener(view -> ClickToReturnHomePage());
        ///next to Event appraisal
        //next event
        ImageView nextEvent = findViewById(R.id.next);
        nextEvent.setOnClickListener(view -> ClickNextTOEventMood());

        ////change color when move
        final View view = findViewById(R.id.circle_one);
        view.setBackground(getResources().getDrawable(R.drawable.ic_baseline_circle_24,null));

        ///next "second Circle "to Event appraisal
        //next circle event
        View secondCircle = findViewById(R.id.circle_two);
        secondCircle.setOnClickListener(v -> ClickOnSecondCircle());
        ////
        View thirdCircle = findViewById(R.id.circle_three);
        thirdCircle.setOnClickListener(v -> ClickOnThirdCircle());




        /////these are for Mood recording
        SeekBar seekBarQuestion1 = findViewById(R.id.seekBar1);
        textViewQuestion1 = findViewById(R.id.textView5);
        SeekBar seekBarQuestion2 = findViewById(R.id.seekBar2);
        textViewQuestion2 = findViewById(R.id.textView8);
        SeekBar seekBarQuestion3 = findViewById(R.id.seekBar3);
        textViewQuestion3 = findViewById(R.id.textView10);
        SeekBar seekBarQuestion4 = findViewById(R.id.seekBar4);
        textViewQuestion4 = findViewById(R.id.textView12);
        SeekBar seekBarQuestion5 = findViewById(R.id.seekBar5);
        textViewQuestion5 = findViewById(R.id.textView14);
        SeekBar seekBarQuestion6 = findViewById(R.id.seekBar);
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
                seekBar.setProgress(0);

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        ////

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
    ///back start screen
    public void ClickToReturnHomePage(){
        Intent intentHomePage = new Intent(MoodRecording.this,MainActivity.class);
        startActivity(intentHomePage);
    }
    ///next event
    public  void ClickNextTOEventMood(){
        Intent intentEvent = new Intent(MoodRecording.this,EventAppraisal.class);
        startActivity(intentEvent);
    }
    ////
    public void ClickOnSecondCircle(){
        Intent intentEventByCircle = new Intent(MoodRecording.this,EventAppraisal.class);
        startActivity(intentEventByCircle);
    }
    /////
    public void ClickOnThirdCircle(){
        Intent intentEventByCircle2 = new Intent(MoodRecording.this, de.rub.selab22a15.SelbestwertImplus.class);
        startActivity(intentEventByCircle2);
    }
}
