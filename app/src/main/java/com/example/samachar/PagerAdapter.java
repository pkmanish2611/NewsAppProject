package com.example.samachar;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    private int tabsNumber;

    public PagerAdapter(FragmentManager fm, int tabs) {
        super(fm);
        this.tabsNumber = tabs;
    }


    @Override
    public Fragment getItem(int position) {
         switch (position){
             case 0:
                 return new first();
             case 1:
                 return new second();
             case 3:
                 return new third();
             case 4:
                 return new fourth();
             default: return null;
         }
    }

    @Override
    public int getCount() {
        return tabsNumber;
    }
}
