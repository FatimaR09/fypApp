package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.Driver.DriverActivity;
import com.example.myapplication.Riders.Riders;

public class MainActivity extends AppCompatActivity {


    CardView DriverCardView;
    CardView RidersCardView;
    CardView RequestsCardView;
    CardView ReportsCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DriverCardView=findViewById(R.id.drivercardview);
        RidersCardView=findViewById(R.id.riderscardview);
        RequestsCardView=findViewById(R.id.requestscardview);
        ReportsCardView=findViewById(R.id.reportscardview);



        DriverCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,  DriverActivity.class);
            }
        });
  RidersCardView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent i=new Intent(MainActivity.this, Riders.class);
      }
  });
  RequestsCardView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent i=new Intent(MainActivity.this,Requests.class);
      }
  });
  ReportsCardView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent i=new Intent(MainActivity.this,Reports.class);
      }
  });
    }




}
