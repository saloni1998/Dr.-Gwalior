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

public class Dentist extends Fragment {
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
        getActivity().setTitle("Dentist");
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        mAdapter = new dataAdapter(dataList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareData();
    }

    private void prepareData() {




       data item=new data("Dr S.P Singh Rajawat","55  Mayur Market  Gandhi Road  Thatipur  Gwalior - 474011  Beside SBI ATM & Indian Oil Petrol Pump ","9827346562 ",4,26.21594,78.20617,"drspyadav@yahoo.co.in","10:00 am - 02:00 pm 05:00 pm - 09:00 pm",R.drawable.dentist);
        dataList.add(item);
      item=new data("Dr Yadavs Advanced Dental Clinic","Yadav Market Garam Sadak Morar Gwalior - 474006  Near Paani Ki Tanki  Below Fitness Point Gym ","9827006206",4.5,26.22719,78.23002,"advcanceddental@gmail.com","10:00 am - 02:00 pm",R.drawable.dentist);
        dataList.add(item);
      item=new data("Dr Yogendra Kumar Paharia","Madhav Rao Society Marg  Scindia Road Gwalior - 474001 Near Chetak Puri Gate","9301103044",4.5,26.21176,78.18713,"pahariayogendradr@gmail.com","02:00 pm - 04:30 pm 06:00 pm - 08:30 pm",R.drawable.dentist);
        dataList.add(item);
      item=new data("Banerjee Dental Clinic","1st Floor  Premila Plaza Gandhi Road Thatipur Gwalior - 474011  Near Dwarkadhish Mandir","9826780922",3.5,26.21503,78.21114,"banerjeedentist@gmail.com","17:00-21:00",R.drawable.dentist);
        dataList.add(item);
      item=new data("Perfect Smile Dental Clinic","261-Jiwaji Nagar Thatipur Gwalior - 474011 Near Sarthak Marriage Garden Opposite of Optimus College","7354926406",3,26.21871,78.20767,"smileperfect@gmail.com","11:00 am - 01:23 pm",R.drawable.dentist);
        dataList.add(item);


        mAdapter.notifyDataSetChanged();







    }

}
