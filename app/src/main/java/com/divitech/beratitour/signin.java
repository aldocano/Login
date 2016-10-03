package com.divitech.beratitour;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.TextView;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;


public class signin extends AppCompatActivity {



    Typeface fonts1;
    CheckBox remember;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        setContentView(R.layout.signin);
        remember = (CheckBox)findViewById(R.id.remember);

        fonts1 =  Typeface.createFromAsset(signin.this.getAssets(),
                "fonts/Lato-Light.ttf");

        TextView t4 =(TextView)findViewById(R.id.remember);
        t4.setTypeface(fonts1);


    }
}
