package com.example.myapplication.Riders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class RiderAdapter  extends  RecyclerView.Adapter {
    private  Context mcontext;
    private List<RiderData> myriderlist;


    public RiderAdapter(Context mcontext, List<RiderData> myriderlist) {
        this.mcontext = mcontext;
        this.myriderlist = myriderlist;
    }






    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup ViewGroup, int i) {


        View mView=LayoutInflater.from(ViewGroup.getContext()).inflate(R.layout.rider_row_item,ViewGroup,false);
        return  new RiderViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
class RiderViewHolder extends RecyclerView.ViewHolder{



    CircleImageView RiderImageView;
    TextView  DriverNametv;
    CardView riderCardView;

    public RiderViewHolder(@NonNull View itemView) {
        super(itemView);


        RiderImageView=itemView.findViewById(R.id.driverimageviewrd);
        DriverNametv=itemView.findViewById(R.id.TextViewDriverNamerd);
        riderCardView=itemView.findViewById(R.id.riderscardview);
    }
}