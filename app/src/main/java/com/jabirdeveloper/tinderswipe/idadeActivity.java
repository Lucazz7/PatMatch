package com.jabirdeveloper.tinderswipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class idadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idade);
    }
    public void staridadeActivity (View view){
        Intent idadeActivity = new Intent(this, idadeActivity.class);
        startActivity(idadeActivity);
    }
    public void staremailActivity (View view){
        Intent emailActivity  = new Intent(this, emailActivity .class);
        startActivity(emailActivity );
    }

}