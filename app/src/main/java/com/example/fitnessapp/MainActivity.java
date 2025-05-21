package com.example.fitnessapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.BaseMenuPresenter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button workout_screen_btn;
    Button timer_screen_btn;
    Button water_screen_btn;


    @SuppressLint({"MissingInflatedId", "RestrictedApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        workout_screen_btn = findViewById(R.id.workout);
        timer_screen_btn = findViewById(R.id.Fps);
        water_screen_btn = findViewById(R.id.waters);

        workout_screen_btn.setOnClickListener(this);
        timer_screen_btn.setOnClickListener(this);
        water_screen_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){

    if(v.getId() == R.id.workout) {
            switchActivity();

    } else if (v.getId() == R.id.Fps) {
            switchActivity2();

    } else if (v.getId() == R.id.waters) {
            switchActivity3();

    }

    }

    public void switchActivity(){
        Intent switchActivityIntent = new Intent(this, Exercise.class);
        startActivity(switchActivityIntent);}
    public void switchActivity2(){
        Intent switchActivityIntent1 = new Intent(this, clocks.class);
        startActivity(switchActivityIntent1);}
    public void switchActivity3(){
        Intent switchActivityIntent2 = new Intent(this, Water_tracker.class);
        startActivity(switchActivityIntent2);
    }
}