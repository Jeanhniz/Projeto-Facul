package com.example.projetofarmacia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CunsultaRemedio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cunsulta_remedio);

        getSupportActionBar().hide();
    }
}