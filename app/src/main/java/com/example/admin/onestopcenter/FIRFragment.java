package com.example.admin.onestopcenter;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

/**
 * Created by admin on 05-Aug-17.
 */

public class FIRFragment extends Fragment {

    View myView;

    Spinner s1,s2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fir_fragment,container,false);
        /*s1 = (Spinner) myView.findViewById(R.id.state);
        s2 = (Spinner) myView.findViewById(R.id.city);
        s2.setEnabled(false);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(s1.getSelectedItemPosition()==0)
                {
                    s2.
                }
                s2.setEnabled(true);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/

        return myView;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Filing FIR");
        ((AppCompatActivity)getActivity()).getSupportActionBar().setSubtitle(null);
    }
}
