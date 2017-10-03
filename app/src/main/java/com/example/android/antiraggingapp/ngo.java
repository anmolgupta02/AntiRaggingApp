package com.example.android.antiraggingapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ngo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo);
    }
    public void website(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.no2ragging.org/en/index.html"));
        startActivity(i);
    }
    public void website2(View V){
        Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.antiragging.in/home.a3spx"));
        startActivity(i);
    }
}
