package com.jabirdeveloper.tinderswipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cadastrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);
    }
    public void starcadastrarActivity (View view){
        Intent cadastrarActivity = new Intent(this, cadastrarActivity.class);
        startActivity(cadastrarActivity);
    }
}