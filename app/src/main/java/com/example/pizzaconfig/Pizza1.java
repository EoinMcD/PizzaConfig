package com.example.pizzaconfig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Pizza1 extends AppCompatActivity {

    public static  String types = "Pizza";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza2);
    }
    public void Moz(View view) {

        types = "Mozzarella";
        Intent intent = new Intent(this,Pizza2.class);
        startActivity(intent);
    }
    public void Pep(View view) {
        types = "Pepperoni";
        Intent intent = new Intent(this,Pizza2.class);
        startActivity(intent);
    }
    public void Veg(View view) {
        types = "Vegetarian";
        Intent intent = new Intent(this,Pizza2.class);
        startActivity(intent);
    }
    public void Bbq(View view) {
        types = "BBQ Chicken";
        Intent intent = new Intent(this,Pizza2.class);
        startActivity(intent);
    }

    }
