package com.example.week6_b4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.week6_b4.model.Cat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcv;
    private RcvAdapter adapter;
    private List<Cat> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv = findViewById(R.id.rev);
        GridLayoutManager layoutManager  = new GridLayoutManager(this,3);
        mList = new ArrayList<>();
        mList.add(new Cat(R.drawable.ic_launcher_background, "cat 1"));
        mList.add(new Cat(R.drawable.ic_launcher_background, "cat 1"));
        mList.add(new Cat(R.drawable.ic_launcher_background, "cat 1"));
        mList.add(new Cat(R.drawable.ic_launcher_background, "cat 1"));
        mList.add(new Cat(R.drawable.ic_launcher_background, "cat 1"));
        mList.add(new Cat(R.drawable.ic_launcher_background, "cat 1"));
        mList.add(new Cat(R.drawable.ic_launcher_background, "cat 1"));
        mList.add(new Cat(R.drawable.ic_launcher_background, "cat 1"));
        rcv.setLayoutManager(layoutManager);
        adapter = new RcvAdapter(this,mList);
        rcv.setAdapter(adapter);
    }
}