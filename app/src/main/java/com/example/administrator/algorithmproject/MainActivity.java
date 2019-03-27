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
        int[] ints = {0, 9, 65, 5, 23, 7, 52, 4 , 7 , 62};
        Log.e("what", "\nbubbleSort--->"+toStr(Algorithm5.sortOfBubble(ints))+
                "\nselectSort--->"+toStr(Algorithm5.sortOfSelect(ints))+
                "\ninsertSort--->"+toStr(Algorithm5.sortOfInsert(ints)));
    }

    private String toStr(int [] value){
        StringBuilder stringBuilder = new StringBuilder();
        for (int aValue : value) {
            stringBuilder.append(aValue);
            stringBuilder.append("  ");
        }
        return stringBuilder.toString();
    }
}
