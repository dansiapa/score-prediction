package com.example.soccerprediction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton btn_berita =findViewById(R.id.btn_berita);
        ImageButton btn_profil = findViewById(R.id.btn_profil);
        ImageButton btn_prediksi = findViewById(R.id.btn_prediksi);

        btn_berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent berita = new Intent(HomeActivity.this , BeritaActivity.class);
                startActivity(berita);
            }
        });

        btn_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profil = new Intent(HomeActivity.this , ProfilActivity.class);
                startActivity(profil);
            }
        });

        btn_prediksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prediksi = new Intent(HomeActivity.this , Pilih1Activity.class);
                startActivity(prediksi);
            }
        });

    }
}
