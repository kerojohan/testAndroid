package com.salle.master.test;

import android.app.Activity;
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
    private ArrayList<String> shopElements = new ArrayList<>();
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,shopElements);

        ListView shopList=(ListView) findViewById(R.id.shopList);
        shopElements.add("First");
        shopElements.add("Second");
        shopElements.add("Third");

        shopList.setAdapter(arrayAdapter);

        Button addButton = (Button) findViewById(R.id.addbutton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),FormActivity.class);
                startActivityForResult(intent,1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            // Make sure the request was successful
        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String itemtoadd=data.getStringExtra("newitem");
                // The user picked a contact.
                System.out.println(itemtoadd);
                shopElements.add(itemtoadd);
                arrayAdapter.notifyDataSetChanged();
            }

            }
    }

}
