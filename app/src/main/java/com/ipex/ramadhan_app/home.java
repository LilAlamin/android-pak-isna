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
        Bundle extras = getIntent().getExtras();
        if (intent.hasExtra("key")){

            if (extras != null) {
                String text = extras.getString("key");
                //The key argument here must match that used in the other activity
                hasil.setText("Assalamualaikum"+" "+text+ ",");
            }

        }
    }
}