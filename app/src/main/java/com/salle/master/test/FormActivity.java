package com.salle.master.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_main);

        Button addbutton = (Button) findViewById(R.id.insertbutton);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                EditText edittext = (EditText) findViewById(R.id.elementtoadd);
                resultIntent.putExtra("newitem", edittext.getText().toString() );
                setResult(Activity.RESULT_OK,resultIntent);
                finish();
            }
        });
    }

}
