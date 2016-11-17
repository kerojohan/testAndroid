package com.salle.master.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button) findViewById(R.id.buttonSend);
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nameEditText=(EditText)findViewById(R.id.editText4);
                System.out.println(nameEditText.getText());
            }
        });*/

        button.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        EditText nameEditText=(EditText)findViewById(R.id.editText4);
        System.out.println(nameEditText.getText());
    }
}
