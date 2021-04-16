package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class fourth_social2 extends AppCompatActivity {
    private ImageView move, move2, move3, move4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_social2);
        move=findViewById(R.id.newactivitybutton8);
        move2=findViewById(R.id.categorybutton12);
        move3=findViewById(R.id.completionbutton8);
        move4=findViewById(R.id.progressbutton9);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_social2.this,fourth_social.class);
                startActivity(intent);
            }
        });
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_social2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_social2.this,fifth.class);
                startActivity(intent);
            }
        });
        move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_social2.this,fourth_social2_progress.class);
                startActivity(intent);
            }
        });
    }
}