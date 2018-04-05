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

public class Chest extends Fragment {
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
        getActivity().setTitle("Chest Specialisits");
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        mAdapter = new dataAdapter(dataList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareData();
    }

    private void prepareData() {



        data item=new data("Dr.HariOm Sharma","Infront of Akashwani, Behind Hotel Sita Manor, Gandhi Road, Gwalior, Madhya Pradesh 474002","096915 44551",4.6,26.2156064,78.1736793,"---","Open 24 Hours",R.drawable.chest);
        dataList.add(item);





        mAdapter.notifyDataSetChanged();







    }

}

