package com.example.android.studentportal;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SALONI on 22-04-2017.
 */

public class Cosmetic extends Fragment {
    private List<data> dataList=new ArrayList<>();
    private RecyclerView recyclerView;
    private dataAdapter mAdapter;

    @Nullable
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.ayur, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Cosmetic");
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        mAdapter = new dataAdapter(dataList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareData();
    }

    private void prepareData() {



        data item=new data("Dr. Kuldeep Saxena","Pan-In-Plaza Near Shan-O-Shaukat  Shinde Ki Chhawani  Lashkar Gwalior  Madhya Pradesh 474001"," 0751 263 6950",3.2,26.2118164,78.1631945,"drkuldeepsaxenagwl@gmail.com"," 11AM–2PM  6–7:30PM",R.drawable.cosmo);
        dataList.add(item);
        item=new data("Dr. Harish Khushiramani","Kayakalp Cosmetic Centre,Gwalior-474001,Jinsi Nala No.3","+(91)-751-2427124",4.0,26.2039006,78.1514146,"---"," 11:00 AM–5:00 PM",R.drawable.cosmo);
        dataList.add(item);
        item=new data("Dr.Amit Agarwal","27-28, 7th Number Chaurah Rd,CP Colony,Raghavpuram,Morar-474006","0751 403 1226",1,26.238004,78.2253413,"---","10:00 AM–10:00 PM",R.drawable.cosmo);
        dataList.add(item);




        mAdapter.notifyDataSetChanged();







    }

}


