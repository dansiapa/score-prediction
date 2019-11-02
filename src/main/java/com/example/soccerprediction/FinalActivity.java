package com.example.soccerprediction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FinalActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Button btn_home = findViewById(R.id.btn_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent (FinalActivity.this , HomeActivity.class);
                startActivity(home);
            }
        });
    }


    public void generate(View view) {
        Random rand = new Random();
        int number = rand.nextInt(5);
        int number2 = rand.nextInt(5);
        TextView hasil_a = findViewById(R.id.hasil_a);
        TextView hasil_b = findViewById(R.id.hasil_b);
        String myString = String.valueOf(number);
        String myString_b = String.valueOf(number2);
        hasil_a.setText(myString);
        hasil_b.setText(myString_b);
    }
}
