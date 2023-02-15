package com.example.quranappv2;


import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



import java.util.List;

public class AyatRecyclerViewAdapter extends RecyclerView.Adapter<AyatRecyclerViewAdapter.MyVH> {

    ArrayList<Ayat> ayatList;
    private  int qariIndex;
    public AyatRecyclerViewAdapter(ArrayList<Ayat> ayatList) {
        this.ayatList = ayatList;

    }

    @NonNull
    @Override
    public AyatRecyclerViewAdapter.MyVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.translated_ayat, parent, false);


        return new MyVH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AyatRecyclerViewAdapter.MyVH holder, int position) {
        holder.data=ayatList.get(position);
        holder.ayat.setText(holder.data.getArabicText());
        //holder.translation.setText(holder.data.getUrduMehmood());
        holder.translation.setText(holder.data.getEnglishMohsin());


        holder.itemView.setBackgroundColor(Color.parseColor("#1E4620"));
    }

    @Override
    public int getItemCount() {
        return ayatList.size();
    }


    public class MyVH extends RecyclerView.ViewHolder {
        TextView ayat;
        TextView translation;
        Ayat data;
        public MyVH(@NonNull View itemView) {
            super(itemView);
            ayat = itemView.findViewById(R.id.textView4);
            translation = itemView.findViewById(R.id.textView5);
        }
    }
}



