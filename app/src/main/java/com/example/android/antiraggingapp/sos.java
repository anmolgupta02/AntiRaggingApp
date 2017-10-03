package com.example.android.antiraggingapp;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sos extends AppCompatActivity {
    EditText editText;
    TextView tv;
    Button btn;
    GPStracker gps;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);
        tv = (TextView) findViewById(R.id.demo);

        btn = (Button)findViewById(R.id.click);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = (EditText)findViewById(R.id.emergency);
                final String num = editText.getText().toString();

                gps = new GPStracker(sos.this);
                if(gps.canGetLocation()) {
                    double latitude = gps.getLatitude();
                    double longitude = gps.getLongitude();
                    String msg = "I am in trouble at these coordinates "+latitude+" and "+longitude+".HELP ME OUT..!!";
                    try{
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(num,null,msg,null,null);
                        Toast.makeText(getApplicationContext(),"HELP send",Toast.LENGTH_LONG).show();

                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),"not send",Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
            }
                else {
                    gps.showSettingsAlert();
                }


            }
        });

    }
}
