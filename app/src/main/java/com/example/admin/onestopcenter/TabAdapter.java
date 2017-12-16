package com.example.admin.onestopcenter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import static com.example.admin.onestopcenter.CompFragment.int_items;

/**
 * Created by admin on 20-12-2017.
 */

public class TabAdapter extends FragmentPagerAdapter {


    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FIRFragment();
            case 1:
                return new MedicalFragment();
            case 2:
                return new CounsellingFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return int_items;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "FIR";
            case 1:
                return "Medical";
            case 2:
                return "Counselling";
        }
        return null;
    }
}
