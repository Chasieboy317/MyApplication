package com.example.chasieboy317.waterapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DiaryEntryPage extends Activity {

    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_entry_page);

        Intent intent = getIntent();
        id = Integer.parseInt(intent.getStringExtra("id"));
        DiaryEntry diaryEntry = MainActivity.diary.getDiaryEntry(id-1);

        TextView date = findViewById(R.id.date);
        TextView grandTotal = findViewById(R.id.grandTotal);
        TextView BWtotal = findViewById(R.id.BWtotal);
        TextView Ttotal = findViewById(R.id.Ttotal);
        TextView Htotal = findViewById(R.id.Htotal);
        TextView Ltotal = findViewById(R.id.Ltotal);
        TextView Dtotal = findViewById(R.id.Dtotal);
        TextView DRtotal = findViewById(R.id.DRtotal);
        TextView Ctotal = findViewById(R.id.Ctotal);
        TextView CLtotal = findViewById(R.id.CLtotal);
        TextView Ototal = findViewById(R.id.Ototal);

        date.setText(date.getText()+" "+diaryEntry.getDate().toString());
        grandTotal.setText(grandTotal.getText()+" "+String.format("%.2f", diaryEntry.getGrandTotal())+"l");
        BWtotal.setText(BWtotal.getText()+" "+Double.toString(diaryEntry.getBWtotal())+"l");
        Ttotal.setText(Ttotal.getText()+" "+Double.toString(diaryEntry.getTtotal())+"l");
        Htotal.setText(Htotal.getText()+" "+Double.toString(diaryEntry.getHtotal())+"l");
        Ltotal.setText(Ltotal.getText()+" "+Double.toString(diaryEntry.getLtotal())+"l");
        Dtotal.setText(Dtotal.getText()+" "+Double.toString(diaryEntry.getDtotal())+"l");
        DRtotal.setText(DRtotal.getText()+" "+Double.toString(diaryEntry.getDRtotal())+"l");
        Ctotal.setText(Ctotal.getText()+" "+Double.toString(diaryEntry.getCtotal())+"l");
        CLtotal.setText(CLtotal.getText()+" "+Double.toString(diaryEntry.getCLtotal())+"l");
        Ototal.setText(Ototal.getText()+" "+Double.toString(diaryEntry.getOtotal())+"l");
    }

    public void startCalculator(View view) {
        Intent calculator = new Intent(this, Calculator.class);
        startActivity(calculator);
        finish();
    }

    public void startOverwiew(View view) {
        Intent overview = new Intent(this, MainActivity.class);
        startActivity(overview);
        finish();
    }

    public void nextEntry(View view) {
        if (MainActivity.diary.getLastID()==(id)) {
        }
        else {
            Intent next = new Intent(this, DiaryEntryPage.class);
            next.putExtra("id", (id+1)+"");
            startActivity(next);
            finish();
        }
    }

    public void previousEntry(View view) {
        if (MainActivity.diary.getFirstID()==(id)) {
        }
        else {
            Intent previous = new Intent(this, DiaryEntryPage.class);
            previous.putExtra("id", (id-1)+"");
            startActivity(previous);
            finish();
        }
    }
}
