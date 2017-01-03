package com.tringapps.app1;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by geethu on 2/11/16.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Intent gettingintent = getIntent();
        String value = gettingintent.getStringExtra("randomname");
    }
}
