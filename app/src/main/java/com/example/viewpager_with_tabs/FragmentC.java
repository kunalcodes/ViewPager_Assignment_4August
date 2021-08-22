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

public class FragmentC extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<String> touristPlaceList = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        touristPlaceList.add("Agra");
        touristPlaceList.add("Udaipur");
        touristPlaceList.add("Kedarnath");
        touristPlaceList.add("Hyderabad");
        touristPlaceList.add("Srinagar");
        touristPlaceList.add("Gangtok");
        touristPlaceList.add("Raipur");
        touristPlaceList.add("Kochi");
        touristPlaceList.add("Dwarka");
        touristPlaceList.add("Darjeeling");
        touristPlaceList.add("Laddakh");
        touristPlaceList.add("Goa");
        touristPlaceList.add("Amritsar");
        touristPlaceList.add("Chandigarh");
        touristPlaceList.add("Delhi");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerViewC);
        setAdapter();
    }

    private void setAdapter() {
        FragmentRecyclerAdapter adapter = new FragmentRecyclerAdapter(touristPlaceList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}