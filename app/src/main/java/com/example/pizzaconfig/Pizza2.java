package com.example.pizzaconfig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Pizza2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza3);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.Name);
        TextView textView = findViewById(R.id.textView4);
        textView.setText(name);

        String address = intent.getStringExtra(MainActivity.Address);
        TextView textView1 = findViewById(R.id.textView8);
        textView1.setText(address);

        String number = intent.getStringExtra(MainActivity.Number);
        TextView textView2 = findViewById(R.id.textView10);
        textView2.setText(number);

        String type = intent.getStringExtra(Pizza1.types);
        TextView textView3 = findViewById(R.id.textView6);
        textView3.setText(type);








    }
}