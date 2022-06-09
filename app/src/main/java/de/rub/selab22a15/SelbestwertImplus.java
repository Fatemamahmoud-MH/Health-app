package de.rub.selab22a15;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class SelbestwertImplus extends AppCompatActivity {
    SeekBar seekbarEventQuestion2;
    TextView textViewEvent2;
    SeekBar seekbarEventQuestion1;
    TextView textViewEvent1;
    SeekBar seekbarEventQuestion3;
    TextView textViewEvent3;
    SeekBar seekbarEventQuestion4;
    TextView textViewEvent4;
    /////
    ImageView clickNext;
    ImageView clickBack;



    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selbestwert_implus);
        /////
        ///Click next
        clickNext = findViewById(R.id.next);
        clickNext.setOnClickListener(v -> ClickNextTOSocialContext());

        ///CLICK BACK
        clickBack = findViewById(R.id.back2);
        clickBack.setOnClickListener(v -> ClickNextTOMoodRecording());
        ////
        final View view1 = findViewById(R.id.circle_three);
        view1.setBackground(getResources().getDrawable(R.drawable.ic_baseline_circle_24,null));


        ///////
        seekbarEventQuestion1 = findViewById(R.id.seekBarSelbst1);
        textViewEvent1 = findViewById(R.id.textViewSelbst1);

        seekbarEventQuestion1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress1, boolean fromUser) {
                if (progress1 >= 9 ) {
                    textViewEvent1.setText(progress1 + " trifft voll und ganz zu ");
                }
                else if (progress1 == 0)
                {
                    textViewEvent1.setText(progress1 + " trifft gar nicht zu");
                }
                else{
                    textViewEvent1.setText(progress1 + " ");
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ///////
        seekbarEventQuestion2 = findViewById(R.id.seekBarSelbst2);
        textViewEvent2 = findViewById(R.id.textViewSelbst2);
        seekbarEventQuestion2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress2, boolean fromUser) {
                if (progress2 >= 9 ) {
                    textViewEvent2.setText(progress2 + " trifft voll und ganz zu ");
                }
                else if (progress2 == 0)
                {
                    textViewEvent2.setText(progress2 + " trifft gar nicht zu");
                }
                else{
                    textViewEvent2.setText(progress2+" ");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        ///////
        seekbarEventQuestion3 = findViewById(R.id.seekBarSelbst3);
        textViewEvent3 = findViewById(R.id.textViewSelbst3);

        seekbarEventQuestion3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress3, boolean fromUser) {
                if (progress3 >= 9 ) {
                    textViewEvent3.setText(progress3 + " trifft voll und ganz zu ");
                }
                else if (progress3 == 0)
                {
                    textViewEvent3.setText(progress3 + " trifft gar nicht zu");
                }
                else{
                    textViewEvent3.setText(progress3 + " ");
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /////
        seekbarEventQuestion4 = findViewById(R.id.seekBarSelbst4);
        textViewEvent4 = findViewById(R.id.textViewSelbst4);

        seekbarEventQuestion4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress4, boolean fromUser) {
                if (progress4 >= 9 ) {
                    textViewEvent4.setText(progress4 + " trifft voll und ganz zu ");
                }
                else if (progress4 == 0)
                {
                    textViewEvent4.setText(progress4 + " trifft gar nicht zu");
                }
                else{
                    textViewEvent4.setText(progress4 + " ");
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
        Intent intentSocialContext = new Intent(SelbestwertImplus.this, de.rub.selab22a15.SocialContext.class);
        startActivity(intentSocialContext);
    }
    public void ClickNextTOMoodRecording(){
        Intent intentMoodRecording = new Intent(SelbestwertImplus.this,EventAppraisal.class);
        startActivity(intentMoodRecording);
    }

}