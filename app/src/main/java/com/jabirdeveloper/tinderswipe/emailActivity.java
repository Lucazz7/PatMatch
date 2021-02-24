package com.jabirdeveloper.tinderswipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class emailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }
    public void staremailActivity (View view){
        Intent emailActivity = new Intent(this, emailActivity.class);
        startActivity(emailActivity);
    }
    public void startelaContratoActivity (View view){
        Intent telaContratoActivity  = new Intent(this, telaContratoActivity.class);
        startActivity(telaContratoActivity);
    }


}