package com.appdevelopersumankr.second_navigation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appdevelopersumankr.second_navigation.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter_for_recycler_one extends RecyclerView.Adapter<Adapter_for_recycler_one.ViewHolder> {


    Integer str1[]={R.drawable.fone,R.drawable.ftwo,R.drawable.fthree,R.drawable.ffour,R.drawable.ffive,R.drawable.fsix,
        R.drawable.fseven,R.drawable.meight,R.drawable.mnine,R.drawable.mten};
    String name[]={"AC","Referygeter","Geyser","Iron","Single Door","Television","Washing Machine","Wtaer Purifier","AC","Double Door"};


    View v;
    Context context;

    public Adapter_for_recycler_one(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        v= LayoutInflater.from ( parent.getContext () ).inflate ( R.layout.blueprint_for_recycler_one,null);
        ViewHolder viewHolder=new ViewHolder (v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView1.setImageResource ( str1[position]);
        holder.name1.setText (name[position]);

    }

    @Override
    public int getItemCount() {
        return str1.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imageView1;
        TextView name1;
        public ViewHolder(@NonNull View itemView) {
            super ( itemView );
            imageView1=itemView.findViewById (R.id.imageviewid);
            name1=itemView.findViewById ( R.id.productname);
        }
    }
}
