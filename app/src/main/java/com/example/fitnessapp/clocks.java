package com.example.fitnessapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class clocks extends AppCompatActivity implements View.OnClickListener {
    Button backs_screen_btn;
    Button start_btn;
    Button reset_btn;
    TextView timer_text;
    Boolean Pause = true;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.timer);

        backs_screen_btn = findViewById(R.id.Back);
        start_btn = findViewById(R.id.start_button);
        reset_btn = findViewById(R.id.Reset_button);
        timer_text = findViewById(R.id.timer_text);



        backs_screen_btn.setOnClickListener(this);
        start_btn.setOnClickListener(this);
        reset_btn.setOnClickListener(this);

        set_up_timer();


    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.start_button){
            if (Pause) {
                Pause = false;
            }else{
                  Pause = true;
            }


        }else if(view.getId() == R.id.Reset_button) {

        }else if(view.getId() == R.id.Back) {
            switchActivity();



        }}

    public void switchActivity() {
        Intent switchActivityIntent = new Intent(this, MainActivity.class);
        startActivity(switchActivityIntent);
    }




    public void set_up_timer() {

         Timer timer = new Timer();

         timer.schedule(new TimerTask() {
             int count_in_seconds =0;

             @Override
             public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (!Pause)
                            count_in_seconds = count_in_seconds + 1;
                        timer_text.setText(Integer.toString(count_in_seconds));
                    }

                });
             }

             private void runOnUiThread(Runnable runnable) {
             }
         }, 0,1000);


     }}