package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void changeColor(View view){
        button1 = findViewById(R.id.button_red);
        button1.setBackgroundColor(0xFF00FFFF);


        Toast.makeText(this,"button click",Toast.LENGTH_LONG).show();
    }
   public void chco(View xyz){
        button2 = findViewById(R.id.button_blue);
        button2.setBackgroundColor(0xFFFF0000);
        Toast.makeText(this,"button click",Toast.LENGTH_LONG).show();

    }
}