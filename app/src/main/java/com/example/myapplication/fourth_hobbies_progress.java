package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class fourth_hobbies_progress extends AppCompatActivity {
    private ImageView move, move2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_hobbies_progress);
        move=findViewById(R.id.categorybutton13);
        move2=findViewById(R.id.returnhobbiesbutton);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_hobbies_progress.this,MainActivity.class);
                startActivity(intent);
            }
        });
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_hobbies_progress.this,fourth_hobbies.class);
                startActivity(intent);
            }
        });
    }
}