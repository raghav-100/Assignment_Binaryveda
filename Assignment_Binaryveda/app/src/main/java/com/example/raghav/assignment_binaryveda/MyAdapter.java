package com.example.raghav.assignment_binaryveda;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by raghav on 7/24/19.
 */


public class MyAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;


    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SkillFragment skillFragment = new SkillFragment();
                return skillFragment;
            case 1:
                WorkFragment workFragment = new WorkFragment();
                return workFragment;
            case 2:
                IndustryFragment industryFragment = new IndustryFragment();
                return industryFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}

