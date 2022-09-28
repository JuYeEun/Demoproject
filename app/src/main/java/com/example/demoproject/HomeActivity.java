package com.example.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button Btn_Home_Bus, Btn_Home_Bus_Stop,Btn_Home_Review, Btn_Home_Book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Btn_Home_Book = findViewById(R.id.btn_home_book);
        Btn_Home_Bus = findViewById(R.id.btn_home_bus);
        Btn_Home_Bus_Stop = findViewById(R.id.btn_home_bus_stop);
        Btn_Home_Review = findViewById(R.id.btn_home_review);

        Btn_Home_Bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,BusSearchActivity.class);
                startActivity(intent);
            }
        });
        Btn_Home_Bus_Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,BusStopSearchActivity.class);
                startActivity(intent);
            }
        });
    }
}