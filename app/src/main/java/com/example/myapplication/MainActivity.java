package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView move, move2, move3, move4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        move=findViewById(R.id.exercisescategory);
        move.setOnClickListener(new View.OnClickListener() {
        @Override
                public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,second.class);
                startActivity(intent);
            }
        });
        move2=findViewById(R.id.hobbiescategory);
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,second_hobbies.class);
                startActivity(intent);
            }
        });
        move3=findViewById(R.id.meditationcategory);
        move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,second_meditation.class);
                startActivity(intent);
            }
        });
        move4=findViewById(R.id.socialcategory);
        move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,second_social.class);
                startActivity(intent);
            }
        });
    }
}
