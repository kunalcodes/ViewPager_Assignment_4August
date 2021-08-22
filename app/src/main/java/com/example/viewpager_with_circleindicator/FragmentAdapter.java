package com.example.viewpager_with_circleindicator;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.viewpager_with_circleindicator.FirstFragment;
import com.example.viewpager_with_circleindicator.SecondFragment;
import com.example.viewpager_with_circleindicator.ThirdFragment;
import com.example.viewpager_with_circleindicator.FourthFragment;


public class FragmentAdapter extends FragmentStateAdapter {

    public FragmentAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return FirstFragment.newInstance("This is First Fragment, So Welcome to circle indicators. Hope you are doing Amazing");
            case 1:
                return SecondFragment.newInstance("This is second Fragment");
            case 2:
                return ThirdFragment.newInstance("This is Third Fragment");
            case 3:
                return FourthFragment.newInstance("This is Fourth Fragment");
        }
        return FirstFragment.newInstance("This is Default Fragment");
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}