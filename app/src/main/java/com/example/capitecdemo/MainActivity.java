package com.example.capitecdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //cred ronewadev
    boolean clicked = true;
    ImageView home, explore, transact, messages, cards;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        home = findViewById(R.id.homeButImg);
        cards = findViewById(R.id.cardButImg);
        transact = findViewById(R.id.tansButImg);
        messages = findViewById(R.id.mesButImg);
        explore = findViewById(R.id.expButImg);



    }




    public void explore(View view) {


        int icon;

        if (clicked) {
            clicked = false;
            icon = R.drawable.closed_explore;
        }else {
            clicked = true;
            icon = R.drawable.open_explore;
        }
            Fragment fragment = new ExploreFragment();

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.fragmentContainerMain, fragment);
            transaction.commit();


    }

    public void messages(View view) {



        Fragment fragment = new MessagesFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragmentContainerMain, fragment);
        transaction.commit();
    }

    public void transact(View view) {
        Fragment fragment = new TransactionsFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragmentContainerMain, fragment);
        transaction.commit();
    }

    public void cards(View view) {
        Fragment fragment = new CardsFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragmentContainerMain, fragment);
        transaction.commit();
    }

    public void home(View view) {
        Fragment fragment = new HomeFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragmentContainerMain, fragment);
        transaction.commit();
    }
}