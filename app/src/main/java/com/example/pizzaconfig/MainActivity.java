package com.example.pizzaconfig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //public static final String EXTRA_MESSAGE = "ie.ul.myfirstapp.EXTRA_MESSAGE";
    public static  String Name = "ie.ul.myfirstapp.EXTRA_MESSAGE";
    public static   String Address = "ie.ul.myfirstapp.EXTRA_MESSAGE";
    public static   String Number = "ie.ul.myfirstapp.EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getInfo(View view) {
        Intent intent = new Intent(this,Pizza2.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        Name = editText.getText().toString();
       // intent.putExtra(Name,name);

        EditText editText1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        Address = editText1.getText().toString();
       // intent.putExtra(Address,address);

        EditText editText2 = (EditText) findViewById(R.id.editTextTextPersonName3);
        Number = editText2.getText().toString();
       // intent.putExtra(Number,number);

        //Intent intent = new Intent(this,Pizza1.class);

        startActivity(intent);

    }
}