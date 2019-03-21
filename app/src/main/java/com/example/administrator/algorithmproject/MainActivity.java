package com.example.administrator.algorithmproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str = "We are happy";
        Log.e("what", "onCreate: "+Algorithm2.replaceInvildeStr(str.toCharArray() , str.length()));
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 100 ; i ++){
            list.add(i);
        }
        Algorithm3.findResult(list , 60);
    }
}
