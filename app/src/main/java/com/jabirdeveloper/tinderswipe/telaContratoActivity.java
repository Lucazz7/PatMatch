package com.jabirdeveloper.tinderswipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class telaContratoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_contrato);
    }
    public void startelaContratoActivity (View view){
        Intent telaContratoActivity = new Intent(this, telaContratoActivity.class);
        startActivity(telaContratoActivity);
    }
    public void starnaoActivity (View view){
        Intent naoActivity  = new Intent(this, naoActivity.class);
        startActivity(naoActivity);
    }
    public void starsimActivity (View view){
        Intent simActivity = new Intent(this, simActivity.class);
        startActivity(simActivity);
    }
}