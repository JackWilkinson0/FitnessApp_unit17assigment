package com.example.fitnessapp;

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

public class Water_tracker extends AppCompatActivity implements View.OnClickListener {
    Button previous_screen_btn;
    Button add_button;
    Button minus_buton;
    TextView count_val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.water_tracker);

        previous_screen_btn = findViewById(R.id.Back_1);
        add_button = findViewById(R.id.add_button);
        minus_buton = findViewById(R.id.minus_button);
        count_val = findViewById(R.id.count_val);

        previous_screen_btn.setOnClickListener(this);
        add_button.setOnClickListener(this);
        minus_buton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        int current_val = Integer.parseInt(count_val.getText().toString());
        int new_val = current_val;


        if (view.getId() == R.id.add_button){
            new_val = current_val +1;


        } else if (view.getId() == R.id.minus_button) {
            new_val = current_val -1;
        }
        count_val.setText(String.valueOf(new_val));

}
}