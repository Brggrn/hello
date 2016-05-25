package com.kache.hello.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.kache.hello.R;

public class MainActivity extends AppCompatActivity {
    ImageButton helpButton;
    ImageButton gameButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        helpButton = (ImageButton) findViewById(R.id.helpButton);
        gameButton = (ImageButton) findViewById(R.id.gameButton);

        // Capture button clicks
        helpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                switch (arg0.getId()) {
                    case R.id.helpButton: {
                        // Start NewActivity.class
                        Intent myIntent = new Intent(MainActivity.this,
                                HelpActivity.class);
                        startActivity(myIntent);
                        break;
                    }

                    case R.id.gameButton: {
                        // do something for button 2 click
                        Intent intent = new Intent(MainActivity.this, GameActivity.class);
                        startActivity(intent);
                        break;



                }

            }
        }});
}
    }
