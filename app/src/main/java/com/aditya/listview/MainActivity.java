package com.aditya.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView=findViewById(R.id.myListView);
        //syntax to declare a arraylist
        ArrayList<String> grocery=new ArrayList<>();
        grocery.add("Biryani");
        grocery.add("Momos");
        grocery.add("Hot Dog");
        grocery.add("Grilled fish");
        grocery.add("Duck");
        grocery.add("Prawns");
        grocery.add("Mutton Seekh kebab");

        // now we have to make an array adapter
        // we make array-adapter to give these items to listView
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,grocery);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //type casting view to textviw
                String text="Item"+position+""+((TextView)view).getText().toString();
                // example=> item0 Biryani
                // example2=> item1 Momos


                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });




    }
}