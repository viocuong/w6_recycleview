package com.example.week6_b4;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.week6_b4.model.Cat;

import java.util.List;

public class RcvAdapter extends RecyclerView.Adapter<RcvAdapter.CatViewHolder>{
    private Activity activity;
    private List<Cat> mList;
    public RcvAdapter(Activity activity, List<Cat> list) {
        this.activity = activity;
        mList = list;
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = activity.getLayoutInflater().inflate(R.layout.card_cat,parent,false);

        return new CatViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        Cat c =mList.get(position);
        holder.img.setImageResource(c.getRsImg());
        holder.tv.setText(c.getName());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    // tao class view holder
    public class CatViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView tv;
        public CatViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
