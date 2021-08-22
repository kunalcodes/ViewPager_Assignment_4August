package com.example.viewpager_with_tabs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentRecyclerAdapter extends RecyclerView.Adapter<ListViewHolder> {

    private ArrayList<String> textList;

    public FragmentRecyclerAdapter(ArrayList<String> textList){
        this.textList = textList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        String text = textList.get(position);
        holder.setData(text);
    }

    @Override
    public int getItemCount() {
        return textList.size();
    }
}
