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

import java.util.ArrayList;

public class FragmentB extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<String> placeList = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        placeList.add("Delhi");
        placeList.add("Bangalore");
        placeList.add("Chennai");
        placeList.add("Hyderabad");
        placeList.add("Pune");
        placeList.add("Gangtok");
        placeList.add("Raipur");
        placeList.add("Kochi");
        placeList.add("Dwarka");
        placeList.add("Darjeeling");
        placeList.add("Laddakh");
        placeList.add("Kanpur");
        placeList.add("Amritsar");
        placeList.add("Chandigarh");
        placeList.add("Mohali");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerViewB);
        setAdapter();
    }

    private void setAdapter() {
        FragmentRecyclerAdapter adapter = new FragmentRecyclerAdapter(placeList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}