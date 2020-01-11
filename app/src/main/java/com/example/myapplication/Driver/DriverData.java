package com.example.myapplication.Driver;

import android.widget.RatingBar;

public class DriverData {

    public DriverData(String driverName, int driverImage, RatingBar ratingbar) {
        DriverName = driverName;
        DriverImage = driverImage;
        Ratingbar = ratingbar;
    }

    private String  DriverName;

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public int getDriverImage() {
        return DriverImage;
    }

    public void setDriverImage(int driverImage) {
        DriverImage = driverImage;
    }

    private  int DriverImage;

    public RatingBar getRatingbar() {
        return Ratingbar;
    }

    public void setRatingbar(RatingBar ratingbar) {
        Ratingbar = ratingbar;
    }
  private  RatingBar Ratingbar;
   // private RatingBar Ratingbar;
}


