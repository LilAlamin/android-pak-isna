package com.ipex.ramadhan_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class home extends AppCompatActivity {
    TextView hasil;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        hasil = findViewById(R.id.hasil);

        Intent intent = getIntent();
        if (intent.hasExtra("NAMA")){
            String text=intent.getStringExtra("NAMA");
            hasil.append("Selamat"+" "+text+ ", anda sudah Terdaftar dengan data:\n");
        }
    }
}