package com.kache.hello.view;

import android.app.Activity;
import android.app.FragmentManager;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.kache.hello.R;

public class GameActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
       FragmentManager fm = getFragmentManager();
        addShowHideListener(new FragmentBubbleworld());

    }

    void addShowHideListener(final Fragment fragment) {
        final ImageButton button = (ImageButton) findViewById(R.id.bubbla);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
               if(fragment.isAdded()){
                   ft.show(fragment);

               }else{
                   ft.add(R.id.fragment_container, fragment,"A");}

                   ft.commit();
            }

        });
    }

    }
