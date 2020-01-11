package com.example.myapplication.Driver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class DriverActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<DriverData>mydriverList;
    DriverData mDriverData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);
        mRecyclerView=findViewById(R.id.DriverRecyclerView);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(DriverActivity.this,1);
      mRecyclerView.setLayoutManager(gridLayoutManager);
      mydriverList=new ArrayList<>();
     // mDriverData=new DriverData("Driver Name",R.drawable.driverimage,"4.4");
     // mDriverData=new DriverData("Driver Name",R.drawable.driverimage,"4.3");
     // mDriverData=new DriverData("Driver Name",R.drawable.driverimage,"4.3");
     // mDriverData=new DriverData("Driver Name",R.drawable.driverimage,"4.3");
      mydriverList.add(mDriverData);

        DriverAdapter driveradapter=new DriverAdapter(DriverActivity.this,mydriverList);
        mRecyclerView.setAdapter(driveradapter);
    }
}

