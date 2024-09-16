package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
        }

        // Método asociado al botón "Button"
        public void mostrar(View view) {
                Toast.makeText(this, "Mensaje a mostrar", Toast.LENGTH_LONG).show();
        }

        // Método asociado al botón "SIGUIENTE"
        public void siguienteVista(View view) {
                Intent i = new Intent(this, Vista2Activity.class);
                i.putExtra("item", "orangután");
                startActivity(i);
        }
}

