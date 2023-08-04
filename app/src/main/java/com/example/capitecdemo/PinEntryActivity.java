package com.example.capitecdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class PinEntryActivity extends AppCompatActivity {
    //cred ronewadev
    ImageView Back;
    EditText pin = findViewById(R.id.pin);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_entry);

       Back =  findViewById(R.id.back_toLogin);
       //Back.setOnClickListener();




    }

    public void Back(View view) {
        if(pin.length() == 0){

        }
        Intent i = new Intent(PinEntryActivity.this, LoginActivity.class);
        startActivity(i);

    }

    public void Submit(View view) {
        Intent i = new Intent(PinEntryActivity.this, MainActivity.class);
        startActivity(i);
    }
}