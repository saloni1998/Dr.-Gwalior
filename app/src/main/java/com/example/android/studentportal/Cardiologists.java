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

public class Cardiologists extends Fragment {
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
        getActivity().setTitle("Cardiologists");
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        mAdapter = new dataAdapter(dataList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareData();
    }

    private void prepareData() {





        data item= new data("Dr Sanjay Dhawale","Lashkar, Gwalior - 474001, Nimbalkar ki goth,Kampoo","+(91)-7489892933",4.7,26.187014, 78.147922,"---","02:00 pm - 03:00 pm 06:30 pm - 08:30 pm",R.drawable.cardiologist);
        dataList.add(item);
        item= new data("Dr. Puneet Rastogi","41, Rama Nikunj, Vikas Nagar, Gwalior - 474001, Near SAI Baba Mandir","+(91)-9827016996",4.4,26.221604, 78.171610,"---","07:00 am - 09:00 am 04:30 pm - 10:30 pm",R.drawable.cardiologist);
        dataList.add(item);
        item= new data("Dr. Sanjay Bansal","25, senapati road, Gwalior - 474001, Ravi Nagar,behind gwalior development authority office","+(91)-9827068643",4.6,26.215441, 78.171004,"---","09:30 am - 02:30 pm 06:30 am - 09:30 am",R.drawable.cardiologist);
        dataList.add(item);
        item= new data("Dr. Anil Agarwal","Gandi Rd, Thatipur, Gwalior - 474011, Nr Dwarikadish Temple","+(91)-9425110911",4.1,26.222080, 78.212088,"---","11:00 am - 02:00 pm 05:30 pm - 08:30 pm",R.drawable.cardiologist);
        dataList.add(item);
        item= new data("Dr. Sunil Gajendragadkar","C/O Global Speciality Hospital, Gandhi Road,Opposite Aakash Vani Kendra , Gwalior - 474003 ","+(91)-751-2433710",4.5,26.222183, 78.191612,"---","09:00 am - 09:00 pm",R.drawable.cardiologist);
        dataList.add(item);


        mAdapter.notifyDataSetChanged();







    }

}
