package com.example.viewpager_with_tabs;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvText;

    public ListViewHolder(@NonNull View itemView) {
        super(itemView);
        mTvText = itemView.findViewById(R.id.tvText);
    }

    public void setData(String text) {
        mTvText.setText(text);
    }
}
