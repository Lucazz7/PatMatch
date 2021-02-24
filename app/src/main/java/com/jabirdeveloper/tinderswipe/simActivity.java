package com.jabirdeveloper.tinderswipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class simActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sim);
    }
    public void starsimActivity (View view){
        Intent simActivity = new Intent(this, simActivity.class);
        startActivity(simActivity);
    }
    public void starselecaopetActivity (View view){
        Intent selecaopetActivity = new Intent(this, selecaopetActivity.class);
        startActivity(selecaopetActivity);
    }
}