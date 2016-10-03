package com.divitech.beratitour;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class signup extends AppCompatActivity {

    Typeface fonts1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        fonts1 =  Typeface.createFromAsset(signup.this.getAssets(),
                "fonts/Lato-Light.ttf");

    }
}
