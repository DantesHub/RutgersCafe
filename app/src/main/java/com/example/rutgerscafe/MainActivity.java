package com.example.rutgerscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    Button button = (Button) findViewById(R.id.donutButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            }
        });
    }

    public void clickedDonut(View view) {
        System.out.println("self made orange");
    }



}