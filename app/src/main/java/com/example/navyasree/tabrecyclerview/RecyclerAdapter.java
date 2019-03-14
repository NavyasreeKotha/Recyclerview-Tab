package com.example.navyasree.tabrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    Context context;
    String[] name;
    int[] image;

    public RecyclerAdapter(MainActivity mainActivity, String[] names, int[] images) {
        this.context=mainActivity;
        this.name=names;
        this.image=images;
    }


    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.design,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        holder.tv.setText(name[position]);
        holder.iv.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;
        public MyViewHolder(View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.imageview);
            tv=itemView.findViewById(R.id.title);
        }
    }
}
