package com.example.healthapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SocialContext extends AppCompatActivity {
    SeekBar seekBarSocialContext;
    TextView textViewSocialContext;
    TextView textViewSpinner2;
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    ArrayAdapter<CharSequence> adapter;
    ///spinner
    private static final int SPINNER_OPTION_FIRST = 0;
    private static final int SPINNER_OPTION_SECOND = 1;
    private static final int SPINNER_OPTION_THIRD = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_context);
        ////spinner1
        spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.YesOrNo, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                switch (position){
                    case SPINNER_OPTION_FIRST:
                    case SPINNER_OPTION_THIRD:
                        textViewSpinner2.setVisibility(View.GONE);
                        spinner2.setVisibility(View.GONE);
                        break;
                    case SPINNER_OPTION_SECOND:
                        textViewSpinner2.setVisibility(View.VISIBLE);
                        spinner2.setVisibility(View.VISIBLE);
                        break;
                }

                Toast.makeText(getApplicationContext(),text, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ///spinner2
        textViewSpinner2 = findViewById(R.id.textViewSpinner2);
        spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.SocialSituation,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter1);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ////spinner3
        spinner3 = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.Context,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter2);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ////seekBar

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

}
