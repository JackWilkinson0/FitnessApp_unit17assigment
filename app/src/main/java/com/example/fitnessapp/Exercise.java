package com.example.fitnessapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercise extends AppCompatActivity implements View.OnClickListener {
    Button BButton;
    Button ADD_BUTTON;
    Button MINUS_BUTTON;
    TextView COUNT_VAL;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.exercise);

        BButton = findViewById(R.id.BButton);
        ADD_BUTTON = findViewById(R.id.ADD_BUTTON);
        MINUS_BUTTON = findViewById(R.id.MINUS_BUTTON);
        COUNT_VAL = findViewById(R.id.COUNT_VAL);

        BButton.setOnClickListener(this);
        ADD_BUTTON.setOnClickListener(this);
        MINUS_BUTTON.setOnClickListener(this);
}



    @Override
    public void onClick(View view) {
        int current_val = Integer.parseInt(COUNT_VAL.getText().toString());
        int new_val = current_val;


        if (view.getId() == R.id.ADD_BUTTON) {
            new_val = current_val + 1;


        } else if (view.getId() == R.id.MINUS_BUTTON) {
            new_val = current_val - 1;


        } else if (view.getId() == R.id.BButton) {
            finish();
        }
        COUNT_VAL.setText(String.valueOf(new_val));


    }
}

