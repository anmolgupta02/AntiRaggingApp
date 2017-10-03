package com.example.android.antiraggingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ngo(View v){
        Intent i = new Intent(this,ngo.class);
        startActivity(i);
    }
    public void report(View v){
        Intent i = new Intent(this,form.class);
        startActivity(i);
    }
    public void rules(View v){
        Intent i = new Intent(this,rules.class);
        startActivity(i);
    }
    public void sos(View v){

        Intent i = new Intent(this,sos.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.call) {
            Intent i = new Intent(this, call.class);
            startActivity(i);

        }
        else  if (id == R.id.about) {
            Intent i = new Intent(this, about.class);
            startActivity(i);

        }
        else{
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
    return true;
    }

}
