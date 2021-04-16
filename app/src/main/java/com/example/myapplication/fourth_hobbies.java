package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class fourth_hobbies extends AppCompatActivity {
    private ImageView move, move2, move3, move4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_hobbies);

        move=findViewById(R.id.newactivitybutton3);
        move2=findViewById(R.id.categorybutton7);
        move3=findViewById(R.id.completionbutton3);
        move4=findViewById(R.id.progressbutton4);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_hobbies.this,fourth_hobbies2.class);
                startActivity(intent);
            }
        });
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_hobbies.this,MainActivity.class);
                startActivity(intent);
            }
        });
        move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_hobbies.this,fifth.class);
                startActivity(intent);
            }
        });
        move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_hobbies.this,fourth_hobbies_progress.class);
                startActivity(intent);
            }
        });

    }
}