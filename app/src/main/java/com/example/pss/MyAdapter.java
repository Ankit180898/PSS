package com.example.pss;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;
    public MyAdapter(Context context,FragmentManager fm,int totalTabs) {
        super(fm);
        this.context=context;
        this.totalTabs=totalTabs;

    }

    //Fragment Tabs

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Upcoming upcoming=new Upcoming();
                return upcoming;

            case 1:
                Past past=new Past();
                return past;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
