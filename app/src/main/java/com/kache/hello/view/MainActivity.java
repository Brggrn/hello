package com.kache.hello.view;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.kache.hello.R;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);
        ImageButton helpButton;
        ImageButton gameButton;
        ImageButton libraryButton;

        // Locate the button in activity_main.xml
        helpButton = (ImageButton) findViewById(R.id.helpButton);
        helpButton.setOnClickListener(this);
        gameButton = (ImageButton) findViewById(R.id.gameButton);
        gameButton.setOnClickListener(this);
        libraryButton = (ImageButton) findViewById(R.id.libraryButton);
        libraryButton.setOnClickListener(this);
    }
    public void onClick(View arg0) {
        switch (arg0.getId()) {
            case R.id.helpButton: {
                // Start NewActivity.class
                Intent myIntent = new Intent(this, HelpActivity.class);
                startActivity(myIntent);
                break;
            }
            case R.id.gameButton: {
                // do something for button 2 click
                Intent intent = new Intent(this, GameActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.libraryButton: {
                Intent intent = new Intent(this, LibraryActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.bubble: {
                Intent intent = new Intent(this, StartGameActivity.class);
                startActivity(intent);
                break;
            }
            }
        }}
