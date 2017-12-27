package com.example.admin.onestopcenter;

//import android.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 05-Aug-17.
 */

public class CompFragment extends Fragment {

    public  static TabLayout tabLayout;
    public  static ViewPager viewPager;
    public static int int_items = 5;
    View myView;

    public CompFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.comp_fragment,container,false);
        tabLayout=(TabLayout) myView.findViewById(R.id.tabs);
        viewPager=(ViewPager) myView.findViewById(R.id.viewpager);
        //set an adpater

        viewPager.setAdapter(new TabAdapter( getChildFragmentManager()));

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });
        return myView;
    }

}
