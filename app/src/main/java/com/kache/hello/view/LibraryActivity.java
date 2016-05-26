package com.kache.hello.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.kache.hello.R;

public class LibraryActivity extends AppCompatActivity {
    //Defining android ListView
    /*ListView mListView;

    //Elements that will be displayed in android ListView
    String[] Countries = new String[]{"India", "Australia", "Newzealand",
            "Indonesia", "China", "Russia", "Japan", "South Korea"};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_library);

      /*  mListView = (ListView) findViewById(R.id.library_list);

        //Declaring Array adapter
        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Countries);

        //Setting the android ListView's adapter to the newly created adapter
        mListView.setAdapter(countryAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //The position where the list item is clicked is obtained from the
                //the parameter position of the android listview
                int itemPosition = position;

                //Get the String value of the item where the user clicked
                String itemValue = (String) mListView.getItemAtPosition(position);

                //In order to start displaying new activity we need an intent
                Intent intent = new Intent(getApplicationContext(),HelpActivity.class);

                //Putting the Id of image as an extra in intent
                //intent.putExtra("flag",FlagId[position]);

                //Here we will pass the previously created intent as parameter
                startActivity(intent);

            }
        });*/
        ListView listview = (ListView) findViewById(R.id.library_list);
       // listview.setOnItemClickListener(this);

    /*public void onItemClick(AdapterView<String> l, View v, int position, long id) {
        Log.i("HelloListView", "You clicked Item: " + id + " at position:" + position);
        // Then you start a new Activity via Intent
        Intent intent = new Intent();
        //intent.setClass(this, ListItemDetail.class);
        intent.putExtra("position", position);
        // Or / And
        intent.putExtra("id", id);
        startActivity(intent);*/

}}
