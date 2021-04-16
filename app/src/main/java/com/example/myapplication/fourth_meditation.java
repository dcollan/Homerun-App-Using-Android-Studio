package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class fourth_meditation extends AppCompatActivity {
    private ImageView move, move2, move3, move4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_meditation);
        move=findViewById(R.id.newactivitybutton5);
        move2=findViewById(R.id.categorybutton9);
        move3=findViewById(R.id.completionbutton5);
        move4=findViewById(R.id.progressbutton6);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_meditation.this,fourth_meditation2.class);
                startActivity(intent);
            }
        });
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_meditation.this,MainActivity.class);
                startActivity(intent);
            }
        });
        move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_meditation.this,fifth.class);
                startActivity(intent);
            }
        });
        move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_meditation.this,fourth_meditation_progress.class);
                startActivity(intent);
            }
        });
    }
}