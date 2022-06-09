package de.rub.selab22a15;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class EventAppraisal extends AppCompatActivity {
    //EVENT
    SeekBar seekbarEventQuestion1;
    SeekBar seekbarEventQuestion2;
    TextView textViewEvent1;
    TextView textViewEvent2;
    SeekBar seekBarSocialContext;
    TextView textViewSocialContext;




    //click next to record other part of mood questions
    ImageView clickNext;
    ImageView clickBack;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_appraisal);
        seekbarEventQuestion1 = findViewById(R.id.seekBarEvent1);
        seekbarEventQuestion2 = findViewById(R.id.seekBarEvent2);
        textViewEvent1 = findViewById(R.id.textViewEvent1);
        textViewEvent2 = findViewById(R.id.textViewEvent2);
        ///Click next
        clickNext = findViewById(R.id.next);
        clickNext.setOnClickListener(v -> ClickNextTOSocialContext());

        ///CLICK BACK
        clickBack = findViewById(R.id.back2);
        clickBack.setOnClickListener(v -> ClickNextTOMoodRecording());


        ///
        final View view = findViewById(R.id.circle_two);
        view.setBackground(getResources().getDrawable(R.drawable.ic_baseline_circle_24,null));

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
        ////seekBar3
        seekBarSocialContext = findViewById(R.id.seekBarSocialContext);
        textViewSocialContext = findViewById(R.id.textViewSocialContext);
        seekBarSocialContext.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressSocial1, boolean fromUser) {
                if(progressSocial1 == 0) {
                    textViewSocialContext.setText("trifft überhaupt nicht zu " + progressSocial1 + "%");
                }
                else if(progressSocial1 == 100){
                    textViewSocialContext.setText("trifft völlig zu " + progressSocial1 + "%");
                }
                else{
                    textViewSocialContext.setText(progressSocial1 + "%");
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
        Intent intentSocialContext = new Intent(EventAppraisal.this, de.rub.selab22a15.SelbestwertImplus.class);
        startActivity(intentSocialContext);
    }
    public void ClickNextTOMoodRecording(){
        Intent intentMoodRecording = new Intent(EventAppraisal.this, de.rub.selab22a15.MoodRecording.class);
        startActivity(intentMoodRecording);
    }


}