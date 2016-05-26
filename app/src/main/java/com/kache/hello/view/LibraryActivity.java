package com.kache.hello.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.kache.hello.R;

import java.util.ArrayList;
import java.util.List;


public class LibraryActivity extends AppCompatActivity {
    ListView list;
    private List<String> List_file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        //http://www.tutorialspoint.com/android/android_list_view.htm
      //  ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_library, mobileArray);

        //ListView listView = (ListView) findViewById(R.id.library_list);
        //listView.setAdapter(adapter);


        List_file =new ArrayList<String>();
        list = (ListView)findViewById(R.id.library_list);

        CreateListView();
    }
    private void CreateListView() {
        List_file.add("Coderzheaven");
        List_file.add("Google");
        List_file.add("Android");
        List_file.add("iPhone");
        List_file.add("Apple");
        //Create an adapter for the listView and add the ArrayList to the adapter.
        list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,List_file));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                //args2 is the listViews Selected index
            }
        });
    }
}
