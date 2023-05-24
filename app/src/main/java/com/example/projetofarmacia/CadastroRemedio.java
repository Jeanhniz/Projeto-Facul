package com.example.projetofarmacia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastroRemedio extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_remedio);

        getSupportActionBar().hide();


    }

    public void cadastrar(View v){
        Intent bt_cadastro = new Intent(this,CunsultaRemedio.class);
        startActivity(bt_cadastro);
    }
}