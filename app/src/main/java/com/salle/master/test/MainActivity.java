package com.salle.master.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView shopList=(ListView) findViewById(R.id.shopList);
        ArrayList<String> shopElements = new ArrayList<>();
        shopElements.add("First");
        shopElements.add("Second");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,shopElements);
        shopList.setAdapter(arrayAdapter);

        Button addButton = (Button) findViewById(R.id.addbutton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),FormActivity.class);
                startActivity(intent);
            }
        });

    }

}
