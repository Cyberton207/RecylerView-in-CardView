package com.example.android.recylerviewwithcardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<ViewHolderClass> {
    ArrayList<DataModel> data;

    public AdapterClass(ArrayList<DataModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.layoutfile,parent,false);
        return new ViewHolderClass(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        holder.textView1.setText(data.get(position).getHeaderText());
        holder.textView2.setText(data.get(position).getDescriptionText());
        holder.img.setImageResource(data.get(position).getImgName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
