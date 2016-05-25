package com.kache.hello.view;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.kache.hello.R;

public class GameActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        // Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        FragmentBubbleworld fragBubb= new FragmentBubbleworld();
        ft.add(R.id.my_game_layout, fragBubb, "worldFragment");
        addShowHideListener(R.id.bubbla, fragBubb);

// Replace the contents of the container with the new fragment
        ft.replace(R.id.fragment_container, new FragmentBubbleworld());
// Complete the changes added above
        ft.commit();
    }

    void addShowHideListener(int buttonId, final Fragment fragment) {
        final ImageButton button = (ImageButton)findViewById(buttonId);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.show(fragment);
                ft.commit();
            }

           });
    }
}