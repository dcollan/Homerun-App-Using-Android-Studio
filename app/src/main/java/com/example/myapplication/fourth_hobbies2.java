package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class fourth_hobbies2 extends AppCompatActivity {
    private ImageView move, move2, move3, move4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_hobbies2);
        move=findViewById(R.id.newactivitybutton4);
        move2=findViewById(R.id.categorybutton8);
        move3=findViewById(R.id.completionbutton4);
        move4=findViewById(R.id.progressbutton5);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_hobbies2.this,fourth_hobbies.class);
                startActivity(intent);
            }
        });
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_hobbies2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_hobbies2.this,fifth.class);
                startActivity(intent);
            }
        });
        move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_hobbies2.this,fourth_hobbies2_progress.class);
                startActivity(intent);
            }
        });
    }
}