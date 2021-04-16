package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class fourth_social_progress extends AppCompatActivity {
    private ImageView move, move2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_social_progress);
        move=findViewById(R.id.categorybutton17);
        move2=findViewById(R.id.returnsocialbutton);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_social_progress.this,MainActivity.class);
                startActivity(intent);
            }
        });
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth_social_progress.this,fourth_social.class);
                startActivity(intent);
            }
        });
    }
}