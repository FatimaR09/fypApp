package com.example.myapplication.Riders;

public class RiderData {
    public String getRDDriverName() {
        return RDDriverName;
    }

    public void setDriverName(String RDdriverName) {
        RDDriverName = RDdriverName;
    }

    public int getRDDriverImage() {
        return RDDriverImage;
    }

    public void setDriverImage(int driverImage) {
        RDDriverImage = driverImage;
    }

    private String  RDDriverName;
    private int RDDriverImage;

    public RiderData(String RDdriverName, int RDdriverImage) {
        RDDriverName = RDdriverName;
        RDDriverImage = RDdriverImage;
    }
}
