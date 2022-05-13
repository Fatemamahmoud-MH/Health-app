package com.example.healthapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class EventAppraisal extends AppCompatActivity {
    //EVENT
    SeekBar seekbarEventQuestion1;
    SeekBar seekbarEventQuestion2;
    TextView textViewEvent1;
    TextView textViewEvent2;

    //click next to record other part of mood questions
    Button clickNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_appraisal);
        seekbarEventQuestion1 = findViewById(R.id.seekBarEvent1);
        seekbarEventQuestion2 = findViewById(R.id.seekBarEvent2);
        textViewEvent1 = findViewById(R.id.textViewEvent1);
        textViewEvent2 = findViewById(R.id.textViewEvent2);
        ///Click next
        clickNext = findViewById(R.id.buttonNext);
        clickNext.setOnClickListener(v -> ClickNextTOSocialContext());

        //SeekBar action
        seekbarEventQuestion1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressEvent1 , boolean b) {
                if(progressEvent1 == 0){
                    textViewEvent1.setText("kein Ereignis " + progressEvent1 + "%" );
                }
                else if(progressEvent1 == 100){
                    textViewEvent1.setText("sehr intensiv " + progressEvent1 + "%" );

                }
                else{
                    textViewEvent1.setText(progressEvent1 + "%" );
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

                    });

        seekbarEventQuestion2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressEvent2, boolean fromUser) {
                if(progressEvent2 == 0){
                    textViewEvent2.setText("kein Ereignis " + progressEvent2 + "%" );
                }
                else if(progressEvent2 == 100){
                    textViewEvent2.setText("sehr intensiv " + progressEvent2 + "%" );

                }
                else{
                    textViewEvent2.setText(progressEvent2 + "%" );
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
    public void ClickNextTOSocialContext(){
        Intent intentSocialContext = new Intent(EventAppraisal.this,SocialContext.class);
        startActivity(intentSocialContext);
    }


}