package com.example.viewpager_with_tabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class FragmentA extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<String> nameList = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nameList.add("Ram");
        nameList.add("Laxman");
        nameList.add("Bharat");
        nameList.add("Ishaan");
        nameList.add("Sita");
        nameList.add("Laxmi");
        nameList.add("Indraeel");
        nameList.add("Abhishek");
        nameList.add("Alexander");
        nameList.add("Donny");
        nameList.add("Raphael");
        nameList.add("Rahul");
        nameList.add("Robin");
        nameList.add("Victor");
        nameList.add("Himesh");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerViewA);
        setAdapter();
    }

    private void setAdapter() {
        FragmentRecyclerAdapter adapter = new FragmentRecyclerAdapter(nameList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}