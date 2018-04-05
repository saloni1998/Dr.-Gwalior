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

public class Dermatologists extends Fragment {
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
        getActivity().setTitle("Dermatologists");
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        mAdapter = new dataAdapter(dataList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareData();
    }

    private void prepareData() {



        data item=new data("Dr. Kuldeep Saxena","Pan-In-Plaza Near Shan-O-Shaukat  Shinde Ki Chhawani  Lashkar Gwalior  Madhya Pradesh 474001"," 0751 263 6950",3.2,26.206888,78.163366,"drkuldeepsaxenagwl@gmail.com"," 11AM–2PM  6–7:30PM",R.drawable.dermatologist);
        dataList.add(item);
        item=new data("The Skin Clinic","Silver estate shopping gallery,University road ,Govindpuri ,Gwalior ,Madhya Pradesh 474002","0751 400 0787",4.6,26.210504,78.199155,"skinclinicgwalior@gmail.com"," 6:30–7:30PM",R.drawable.dermatologist);
        dataList.add(item);
        item=new data("Dr.S.M.Jain Skin Care and Allergy Center","Naya Bazar Lashkar Gwalior","0751 262 6857",4,26.195935,78.156081,"smjskin@gmail.com","10:30AM–2PM 6–9PM",R.drawable.dermatologist);
        dataList.add(item);
        item=new data("Dr. Premy Skin Hair & Laser Clinic","Premy complex opp madhav dispensary hospital road  Gwalior Madhya Pradesh 474009","0751 407 8881",3,26.195897,78.16211,"premyskinhrl@gmail.com"," 9:30AM–8:30PM",R.drawable.dermatologist);
        dataList.add(item);



        mAdapter.notifyDataSetChanged();







    }

}
