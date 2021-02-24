package com.jabirdeveloper.tinderswipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nome);
    }
    public void starnomeActivity (View view){
        Intent nomeActivity = new Intent(this, nomeActivity.class);
        startActivity(nomeActivity);
    }
    public void staridadeActivity (View view){
        Intent idadeActivity = new Intent(this, idadeActivity.class);
        startActivity(idadeActivity);
    }
}