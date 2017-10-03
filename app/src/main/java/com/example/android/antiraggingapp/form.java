package com.example.android.antiraggingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class form extends AppCompatActivity {
    int Attackers;
    String nameVictims,otherLocation;
    EditText noOfAttckers,nameVictim,time,otherlocation;
    Spinner sp;
    String[] locations = {"Canteen","Staircase","Ground","Roof"," Any Locked Classrooms","Auditorium","Washrooms","Parked College Bus"};
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        noOfAttckers = (EditText)findViewById(R.id.et1);

        nameVictim = (EditText)findViewById(R.id.et2);

        time = (EditText)findViewById(R.id.editText);

        otherlocation=(EditText)findViewById(R.id.other);
        String att = noOfAttckers.getText().toString();
        Attackers = !att.equals("")?Integer.parseInt(att):0;

        nameVictims = nameVictim.getText().toString();

        otherLocation =otherlocation.getText().toString();

        sp = (Spinner)findViewById(R.id.location);
        adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,locations);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);


    }

    public void submit(View v){
        Toast.makeText(form.this,"Your Response has been submitted",Toast.LENGTH_LONG).show();
    }
    public void cancel1(View V){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}

