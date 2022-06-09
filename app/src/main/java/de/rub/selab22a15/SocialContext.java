package de.rub.selab22a15;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SocialContext extends AppCompatActivity {

    TextView textViewSpinner2;
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;

    ImageView ClickOnImageToBack;
    ///spinner
    private static final int SPINNER_OPTION_FIRST = 0;
    private static final int SPINNER_OPTION_SECOND = 1;
    private static final int SPINNER_OPTION_THIRD = 2;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_context);

        ////change color
        final View view1 = findViewById(R.id.circle_four);
        view1.setBackground(getResources().getDrawable(R.drawable.ic_baseline_circle_24,null));

        ///
        ClickOnImageToBack = findViewById(R.id.back2);
        ClickOnImageToBack.setOnClickListener(view -> ClickOnToBackEvent());


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
                    case SPINNER_OPTION_SECOND:
                        textViewSpinner2.setVisibility(View.GONE);
                        spinner2.setVisibility(View.GONE);
                        break;
                    case SPINNER_OPTION_THIRD:
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


    }
    ////click on button to back to event pag
    public void ClickOnToBackEvent(){
        Intent intentEventByCircle2 = new Intent(SocialContext.this,SelbestwertImplus.class);
        startActivity(intentEventByCircle2);
    }

}
