package com.example.soccerprediction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pilih1Activity extends AppCompatActivity {

    //variables radio button
    RadioGroup pilihan_1;
    RadioGroup pilihan_2;
    RadioButton pilihan1;
    RadioButton pilihan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih1);

        pilihan_1 = findViewById(R.id.pilihan_1);
        pilihan_2 = findViewById(R.id.pilihan_2);


        //Button Next
        Button btn_next = findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = pilihan_1.getCheckedRadioButtonId();
                int selectedId2 = pilihan_2.getCheckedRadioButtonId();
                pilihan1 = findViewById(selectedId);
                pilihan2 = findViewById(selectedId2);

                Toast.makeText(Pilih1Activity.this, pilihan1.getText(), Toast.LENGTH_SHORT).show();
                Toast.makeText(Pilih1Activity.this, pilihan2.getText(), Toast.LENGTH_SHORT).show();
                Intent next = new Intent(Pilih1Activity.this , FinalActivity.class);
                startActivity(next);
            }
        });

    }

}
