package com.example.android.studentportal;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SALONI on 20-04-2017.
 */

public class dataAdapter extends RecyclerView.Adapter<dataAdapter.MyViewHolder> {
    private List<data> dataList;



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, address, phone;
        public RatingBar ratingBar;
        public Button button;


        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            address = (TextView) view.findViewById(R.id.address);
            phone = (TextView) view.findViewById(R.id.phone);
            ratingBar=(RatingBar)view.findViewById(R.id.ratingBar);
            button=(Button)view.findViewById(R.id.enquire);




        }


    }
    public dataAdapter(List<data> dataList) {
        this.dataList = dataList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_data, parent, false);

        return new MyViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final data item = dataList.get(position);
        holder.name.setText(item.getName());
        holder.address.setText(item.getAddress());
        holder.phone.setText(item.getPhone());
        holder.ratingBar.setRating((float) item.getRating());

        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(v.getId()==R.id.enquire)
                {
                    Intent i= new Intent(v.getContext(), display.class);
                    i.putExtra("name",item.getName());
                    i.putExtra("rating",item.getRating());
                    i.putExtra("address",item.getAddress());
                    i.putExtra("phone",item.getPhone());
                    i.putExtra("latitude",item.getLatitude());
                    i.putExtra("longitude",item.getLongitude());
                    i.putExtra("email",item.getEmail());
                    i.putExtra("time",item.getTime());
                    i.putExtra("icon",item.getIcon());
                    v.getContext().startActivity(i);
                }

            }
        });



    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }

}
