package com.example.capitecdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    //cred ronewadev
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void SignIn(View view) {
        Intent i = new Intent(this, PinEntryActivity.class);
        startActivity(i);
    }

    public void buyPrepaidPressed(View view) {

        Fragment fragment = new PinEntryFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.pinEntryFragment, fragment);
        transaction.commit();
    }
}