package com.example.quiz;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class login extends AppCompatActivity {
    public void  onStart() {
        super.onStart();
        setContentView(R.layout.activity_login);
        Intent run = new Intent(login.this, PlayActivity.class);
        startActivity(run);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView play = findViewById(R.id.cardview1);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(login.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        CardView howTo = findViewById(R.id.cardview2);
        howTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent howToIntent = new Intent(login.this, HowTo.class);
                startActivity(howToIntent);
            }
        });
    }
}