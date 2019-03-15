package com.example.administrator.algorithmproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str = "We are happy";
        Log.e("what", "onCreate: "+Algorithm2.replaceInvildeStr(str.toCharArray() , str.length()));
    }
}
