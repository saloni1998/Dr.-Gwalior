package com.example.android.studentportal;

import android.os.Bundle;
import android.widget.FrameLayout;

public class SAD extends InfoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sad);

        FrameLayout frame = (FrameLayout)findViewById(R.id.content_frame);
        getLayoutInflater().inflate(R.layout.activity_sad,frame);
    }
}
