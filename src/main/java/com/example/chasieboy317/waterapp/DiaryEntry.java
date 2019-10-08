package com.example.chasieboy317.waterapp;

import java.util.Date;

public class DiaryEntry {

    private int id;
    private Date date;
    private double grandTotal;
    private double BWtotal;
    private double Ttotal;
    private double Htotal;
    private double Ltotal;
    private double Dtotal;
    private double DRtotal;
    private double Ctotal;
    private double CLtotal;
    private double Ototal;

    public DiaryEntry(int id, Date date, double BWtotal, double Ttotal, double Htotal, double Ltotal, double Dtotal, double DRtotal, double Ctotal, double CLtotal, double Ototal) {
        this.id=id;
        this.date=date;
        this.BWtotal=BWtotal;
        this.Ttotal=Ttotal;
        this.Htotal=Htotal;
        this.Ltotal=Ltotal;
        this.Dtotal=Dtotal;
        this.DRtotal= DRtotal;
        this.Ctotal=Ctotal;
        this.CLtotal=CLtotal;
        this.Ototal=Ototal;
        grandTotal=BWtotal+Ttotal+Htotal+Ltotal+Dtotal+DRtotal+Ctotal+CLtotal+Ototal;

    }

    public String toString() {
        return (id+","+
                date.toString()+","+
                BWtotal+","+
                Ttotal+","+
                Htotal+","+
                Ltotal+","+
                Dtotal+","+
                DRtotal+","+
                Ctotal+","+
                CLtotal+","+
                Ototal);
    }

    public int getID() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public double getBWtotal() {
        return (BWtotal);
    }

    public double getTtotal() {
        return (Ttotal);
    }

    public double getHtotal() {
        return (Htotal);
    }

    public double getLtotal() {
        return (Ltotal);
    }

    public double getDtotal() {
        return (Dtotal);
    }

    public double getDRtotal() {
        return (DRtotal);
    }

    public double getCtotal() {
        return (Ctotal);
    }

    public double getCLtotal() {
        return (CLtotal);
    }

    public double getOtotal() {
        return (Ototal);
    }

    public double getGrandTotal() {
        return (grandTotal);
    }
}
