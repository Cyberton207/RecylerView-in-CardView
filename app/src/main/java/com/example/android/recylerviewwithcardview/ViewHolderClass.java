package com.example.android.recylerviewwithcardview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
/*
 The main work of these ViewHolderClass is to
 Take reference of the Views from XML file named as Layoutfile.xml
 */
public class ViewHolderClass extends RecyclerView.ViewHolder {
    ImageView img;
    TextView textView1,textView2;
    public ViewHolderClass(@NonNull View itemView) {
        super(itemView);
        img = (ImageView)itemView.findViewById(R.id.imgView);
        textView1 = (TextView) itemView.findViewById(R.id.textView1);
        textView2 = (TextView) itemView.findViewById(R.id.textView2);
    }
}
