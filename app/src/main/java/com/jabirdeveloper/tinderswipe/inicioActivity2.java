package com.jabirdeveloper.tinderswipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inicioActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
    }
    public void starinicioActivity2 (View view){
        Intent inicioActivity2 = new Intent(this, inicioActivity2.class);
        startActivity(inicioActivity2);
    }

    public void starcachorrosActivity (View view){
        Intent cachorrosActivity = new Intent(this, idadeActivity.class);
        startActivity(cachorrosActivity);
    }
    public void stargatosActivity (View view){
        Intent gatosActivity = new Intent(this, nomeActivity.class);
        startActivity(gatosActivity);
    }

    public void starcadastrarActivity (View view){
        Intent cadastrarActivity = new Intent(this, cadastrarActivity.class);
        startActivity(cadastrarActivity);
    }

}