package com.example.admin.onestopcenter;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 05-Aug-17.
 */

public class StatusFragment extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.status_fragment,container,false);
        //((AppCompatActivity)getActivity()).getSupportActionBar().hide();
        return myView;
    }
    @Override
    public void onResume() {
        super.onResume();
        //((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Status");
        //((AppCompatActivity)getActivity()).getSupportActionBar().setSubtitle(null);
    }
}
