package com.example.chasieboy317.waterapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ListEntries extends Activity {
    private RecyclerView rView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_entries);

        rView = (RecyclerView) findViewById(R.id.recyclerView);
        //rView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        rView.setLayoutManager(mLayoutManager);
        rView.setItemAnimator(new DefaultItemAnimator());

        adapter = new MyAdapter(MainActivity.diary);
        rView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), rView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                int id = MainActivity.diary.getDiaryEntry(position).getID();
                Intent intent = new Intent(view.getContext(), DiaryEntryPage.class);
                intent.putExtra("id", id+"");
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        rView.setAdapter(adapter);

    }
}
