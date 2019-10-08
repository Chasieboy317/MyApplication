package com.example.chasieboy317.waterapp;

import android.view.View;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Date;

public class Diary {

    private List<DiaryEntry> diary;

    public Diary() {
        diary = new ArrayList<DiaryEntry>();
    }

    public DiaryEntry getDiaryEntry(int id) {
        return diary.get(id);
    }

    public int getFirstID() {
        if (diary.size()==0) {return 0;}
        else {return this.getDiaryEntry(0).getID();}
    }

    public int getLastID() {
        if (diary.size()==0) {return 0;}
        else {return this.getDiaryEntry(diary.size()-1).getID(); }
    }

    public int getDiarySize() {
        return diary.size();
    }

    public void addToDiary(DiaryEntry diaryEntry) {
        diary.add(diaryEntry);
    }

    public void removeFromDiary(int id) {
        for (DiaryEntry x: diary) {
            if (x.getID()==id) {
                diary.remove(id);
            }
        }
    }

    public void clearDiary() {
        diary.clear();
    }

    public double getTotal() {
        if (diary.size()!=0) {
            double total = 0;
            for (DiaryEntry x : diary) {
                total += x.getGrandTotal();
            }
            return total;
        }
        else {return 0;}
    }

    public double getAverage() {
        return this.getTotal()/diary.size();
    }

    public void BuildDiaryFromFile (File file) {
        try {
            String[] diaryEntry = new String[11];
            String line="";
            int num=0;
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while (reader.readLine()!=null) {
                num++;
            }
            reader.close();
            reader = new BufferedReader(new FileReader(file));
            for (int i=0; i<num; i++) {
                line = reader.readLine();
                diaryEntry = line.split(",");
                this.addToDiary(new DiaryEntry(Integer.parseInt(diaryEntry[0]), new Date(diaryEntry[1]), Double.parseDouble(diaryEntry[2]),
                        Double.parseDouble(diaryEntry[3]), Double.parseDouble(diaryEntry[4]),
                        Double.parseDouble(diaryEntry[5]), Double.parseDouble(diaryEntry[6]),
                        Double.parseDouble(diaryEntry[7]), Double.parseDouble(diaryEntry[8]),
                        Double.parseDouble(diaryEntry[9]), Double.parseDouble(diaryEntry[10])));
                diaryEntry=new String[11];
            }
            reader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WriteDiaryToFile(File file) {
        try {
            PrintWriter writer = new PrintWriter(file, "UTF-8");
            for (DiaryEntry x: diary) {
                writer.println(x.toString());
            }
            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
