package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Vista2Activity extends AppCompatActivity {

    private TextView detailTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista2);

        // Inicializar el TextView
        detailTextView = findViewById(R.id.detailTextView);

        // Obtener el texto de la Intent
        String item = getIntent().getStringExtra("item");
        detailTextView.setText(item);
    }
}
