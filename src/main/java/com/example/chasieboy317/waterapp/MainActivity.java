package com.example.chasieboy317.waterapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends Activity {

    static Diary diary = new Diary();
    static File WaterApp;
    static Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res=getResources();
        if (diary.getDiarySize()==0) {
            WaterApp = new File(this.getFilesDir(), "WaterApp");
            diary.BuildDiaryFromFile(WaterApp);
        }
        TextView totalWater = (TextView)findViewById(R.id.twater);
        TextView averageWater = (TextView)findViewById(R.id.awater);
        totalWater.setText(String.format("%.2f", diary.getTotal())+"l");
        averageWater.setText(String.format("%.2f", diary.getAverage())+"l");
    }

    public void startCalculator(View view) {
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }

    public void listEntries(View view) {
        Intent intent = new Intent(this, ListEntries.class);
        startActivity(intent);
    }

}
