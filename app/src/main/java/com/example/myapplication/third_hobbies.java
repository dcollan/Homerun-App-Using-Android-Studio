package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class third_hobbies extends AppCompatActivity {
    private ImageView move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_hobbies);
        move=findViewById(R.id.beginbutton2);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(third_hobbies.this,fourth_hobbies.class);
                startActivity(intent);
            }
        });
    }
}