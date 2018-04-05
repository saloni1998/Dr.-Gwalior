package com.example.android.studentportal;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class display extends AppCompatActivity implements View.OnClickListener {

    TextView name,phoneNo,location,time,email;
    RatingBar rating;
    ImageButton map;
    Double value5,value6;
    ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Bundle extras = getIntent().getExtras();
        name=(TextView)findViewById(R.id.textView2);
        phoneNo=(TextView)findViewById(R.id.phoneNo);
        location=(TextView)findViewById(R.id.location);
        rating=(RatingBar)findViewById(R.id.ratingBar2);
        email=(TextView)findViewById(R.id.mailid);
        time=(TextView)findViewById(R.id.time);
        icon=(ImageView)findViewById(R.id.pic);

        String value1 = extras.getString("name");
        double value2 = extras.getDouble("rating");
        String value3 = extras.getString("address");
        String value4 = extras.getString("phone");
        value5= extras.getDouble("latitude");
        value6= extras.getDouble("longitude");
        String value7=extras.getString("email");
        String value8=extras.getString("time");
        int image=extras.getInt("icon");




        name.setText(value1);
        rating.setRating((float) value2);
        location.setText(value3);
        phoneNo.setText(value4);
        email.setText(value7);
        time.setText(value8);
        icon.setImageResource(image);


        map=(ImageButton)findViewById(R.id.home);
        map.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,MapsActivity.class);
        i.putExtra("latitude",value5);
        i.putExtra("longitude",value6);
        startActivity(i);



    }
}
