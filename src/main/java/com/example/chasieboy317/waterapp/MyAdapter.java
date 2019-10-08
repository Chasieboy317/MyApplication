package com.example.chasieboy317.waterapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static java.security.AccessController.getContext;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Diary mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView date, grandTotal;
        public ViewHolder(View v) {
            super(v);
            date = (TextView) v.findViewById(R.id.date);
            grandTotal = (TextView) v.findViewById(R.id.grandTotal);
        }
    }

    public MyAdapter(Diary dataset) {
        mDataset = dataset;
    }

    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        String s = MainActivity.res.getString(R.string.totalWater);
        holder.date.setText(mDataset.getDiaryEntry(position).getDate().toString());
        holder.grandTotal.setText(s+String.format("%.2f", mDataset.getDiaryEntry(position).getGrandTotal())+"l");
    }

    public int getItemCount() {
        return mDataset.getDiarySize();
    }


}
