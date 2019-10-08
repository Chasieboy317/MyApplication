package com.example.chasieboy317.waterapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Date;

public class Calculator extends Activity {

    static double grandTotal;
    static double BWtotal;
    static double Ttotal;
    static double Htotal;
    static double Ltotal;
    static double Dtotal;
    static double DRtotal;
    static double Ctotal;
    static double CLtotal;
    static double Ototal;
    int id;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        id = MainActivity.diary.getLastID();
        grandTotal=0;
        BWtotal=0;
        Ttotal=0;
        Htotal=0;
        Ltotal=0;
        Dtotal=0;
        DRtotal=0;
        Ctotal=0;
        CLtotal=0;
        Ototal=0;

        editText = (EditText)findViewById(R.id.OeditText);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText.getText()+"").equals("")) {
                    Ototal = 0;
                    updateGrandTotal();
                    setTextView((TextView) findViewById(R.id.Ototal), "Total: " + Ototal + "l");
                    setTextView((TextView) findViewById(R.id.grandTotal), "GrandTotal: " + grandTotal + "l");
                }
                else {
                    Ototal = Double.parseDouble(editText.getText() + "");
                    updateGrandTotal();
                    setTextView((TextView) findViewById(R.id.Ototal), "Total: " + Ototal + "l");
                    setTextView((TextView) findViewById(R.id.grandTotal), "GrandTotal: " + grandTotal + "l");
                }
            }
        });
    }

    public String getText(TextView textView) {
        return textView.getText().toString();
    }

    public void setTextView(TextView textView, String s) {
        textView.setText(s);
    }

    public void updateGrandTotal() {
        grandTotal=BWtotal+Ttotal+Htotal+Ltotal+Dtotal+DRtotal+Ctotal+CLtotal+Ototal;
    }

    public void BWIncrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.BWincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number++;
        BWtotal=number*10;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.Btotal), "Total: "+BWtotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void BWDecrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.BWincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number--;
        BWtotal=number*10;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.Btotal), "Total: "+BWtotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void TIncrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.Tincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number++;
        Ttotal=number*7;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.Ttotal), "Total: "+Ttotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void TDecrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.Tincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number--;
        Ttotal=number*7;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.Ttotal), "Total: "+Ttotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void HIncrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.Hincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number++;
        Htotal=(number*0.4);
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.Htotal), "Total: "+(new DecimalFormat(".##")).format(Htotal)+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+(new DecimalFormat(".##")).format(grandTotal)+"l");
    }

    public void HDecrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.Hincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number--;
        Htotal=number*0.4;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.Htotal), "Total: "+(new DecimalFormat(".##")).format(Htotal)+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+(new DecimalFormat(".##")).format(grandTotal)+"l");
    }

    public void LIncrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.Lincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number++;
        Ltotal=number*10;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.Ltotal), "Total: "+Ltotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void LDecrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.Lincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number--;
        Ltotal=number*10;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.Ltotal), "Total: "+Ltotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void DIncrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.Dincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number++;
        Dtotal=number*9;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.Dtotal), "Total: "+Dtotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void DDecrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.Dincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number--;
        Dtotal=number*9;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.Dtotal), "Total: "+Dtotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void DRIncrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.DRincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number++;
        DRtotal=number*3;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.DRtotal), "Total: "+DRtotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void DRDecrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.DRincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number--;
        DRtotal=number*3;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.DRtotal), "Total: "+DRtotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void CIncrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.Cincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number++;
        Ctotal=number*2;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.Ctotal), "Total: "+Ctotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void CDecrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.Cincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number--;
        Ctotal=number*2;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.Ctotal), "Total: "+Ctotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void CLIncrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.CLincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number++;
        CLtotal=number*2;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.CLtotal), "Total: "+CLtotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void CLDecrementOne(View view) {
        TextView textView = (TextView)findViewById(R.id.CLincrement);
        String text = getText(textView);
        int number = Integer.parseInt(text);
        number--;
        CLtotal=number*2;
        setTextView(textView, number+"");
        setTextView((TextView)findViewById(R.id.CLtotal), "Total: "+CLtotal+"l");
        updateGrandTotal();
        setTextView((TextView)findViewById(R.id.grandTotal), "GrandTotal: "+grandTotal+"l");
    }

    public void addToDiary(View view) {
        id++;
        DiaryEntry diaryEntry = new DiaryEntry(id, new Date(), BWtotal, Ttotal, Htotal, Ltotal, Dtotal, DRtotal, Ctotal, CLtotal, Ototal);
        MainActivity.diary.addToDiary(diaryEntry);
        MainActivity.diary.WriteDiaryToFile(MainActivity.WaterApp);
        EditText editText = (EditText)findViewById(R.id.OeditText);
        editText.setText("");
        Intent diaryEntryPage = new Intent(this, DiaryEntryPage.class);
        Intent listEntries = new Intent(this, ListEntries.class);
        diaryEntryPage.putExtra("id", id+"");
        startActivity(listEntries);
        startActivity(diaryEntryPage);
        finish();
    }


}
