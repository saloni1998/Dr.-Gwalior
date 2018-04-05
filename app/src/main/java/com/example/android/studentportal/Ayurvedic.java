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
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

import static com.example.android.studentportal.R.styleable.View;

/**
 * Created by SALONI on 15-04-2017.
 */

public class Ayurvedic extends Fragment {
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
        getActivity().setTitle("Ayurvedic");
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        mAdapter = new dataAdapter(dataList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareData();
    }

    private void prepareData() {
        /*data item=new data(" Dr.Prabhakar Aushadhalya","Nai Sadak, Street Next To Filmsatan Talkies,Lashkar,Gwalior-474001,Near Kilkari Hospital","+(91)-9300010922",5,26.204325,78.154063);
        dataList.add(item);

        item=new data("Dr.Dharmendra Richariya ","M-258, Madhav Nagar Rd, Madhav Nagar, Lashkar, Gwalior, Madhya Pradesh 474002","+(91)-8435816730",5,26.198952,78.176402);
        dataList.add(item);

        item=new data("Dr.Anil Gupta","C/o Samadhan Ayurvedic And Panchkarma Chikitsalya,Lashkar,Gwalior-474001, Near Kartar Hotel And Roxypul","+(91)-751-2636707",4,26.195760,78.149991);
        dataList.add(item);

        item=new data("Dr.B.K.Suri","Samadhiya Colony, Kala Saiyad, Gwalior, Madhya Pradesh 474001","+(91)-8563214789",3.7,0,0);
        dataList.add(item);

        item=new data("Dr.Mahesh Chaurasiya ","Gopal Ji Complex, Sadar Bazar, Sadar Bazar Road, Morar, Gwalior, Madhya Pradesh 474006","+(91)-7562148963",3.5,0,0);
        dataList.add(item);

        item=new data("Dr.Nirmal Pandey","Near Ayurvedic College, Amkho Laskar, Gwalior, Madhya Pradesh 474001","+(91)-9632587411",3.5,0,0);
        dataList.add(item);

        item=new data("Dr.Chinmay Rane","Raam Kui, New Vrijvihar Colony, Shekh Ki Bagiya, Gwalior, Madhya Pradesh 474001","+(91)-9874563212",3,0,0);
        dataList.add(item);*/

        data item= new data("Prabhakar Aushadhalaya","Nai Sadak, Street Next To Filmsatan Talkies, Lashkar, Gwalior - 474001, Near Kilkari Hospital","+(91)-9300010922",4.5,26.205608, 78.150731,"---","11:00 am - 02:00 pm 05:30 pm - 08:30 pm",R.drawable.ayurvedic);
        dataList.add(item);

        item= new data("Dr. Anil Gupta","Lashkar, Gwalior - 474001, Near Ashish Medical, Lakkadkhana Pool"," +(91)-8982012686",5.0,26.191856, 78.149317,"---","10:00 am - 02:00 pm 06:00 am - 09:00 pm",R.drawable.ayurvedic);
        dataList.add(item);

        item= new data("Nidanam Ayurved And Physiotherapy","Lashkar, Gwalior - 474001, Near Ashish Medical, Lakkadkhana Pool","+(91)-9300010922",4.5,26.191856, 78.149317,"---","11:00 am - 02:00 pm 05:30 pm - 08:30 pm",R.drawable.ayurvedic);
        dataList.add(item);

        item= new data("Dr. Ana Batra (Batra Homyopathic Clinic)","C/o Batra Homyopathic Clinic, Gwalior - 474001","+(91)-9074606962",3.5,26.198518, 78.164980,"---","09:30 am - 06:30 pm",R.drawable.ayurvedic);
        dataList.add(item);

        item= new data("Dr. Abhnav Khare","Thatipur,","+(91)-9424970727",4.5,26.222080, 78.212088,"---","11:00 am - 02:00 pm 05:30 pm - 08:30 pm",R.drawable.ayurvedic);
        dataList.add(item);










        mAdapter.notifyDataSetChanged();
    }
}

