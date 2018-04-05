package com.example.android.studentportal;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class starting extends Fragment {
    @Nullable
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        getActivity().setTitle("Dr.Gwalior");
        return inflater.inflate(R.layout.activity_starting, container, false);
    }
}
