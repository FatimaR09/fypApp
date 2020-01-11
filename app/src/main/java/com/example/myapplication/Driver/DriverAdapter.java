package com.example.myapplication.Driver;

import android.content.Context;
import android.media.Rating;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class DriverAdapter extends  RecyclerView.Adapter<DriverViewHolder> {
    public DriverAdapter(Context mContext, List<DriverData> mdriverList) {
        this.mContext = mContext;
        this.mdriverList = mdriverList;
    }

    private Context mContext;
private List<DriverData> mdriverList;




    @NonNull
    @Override
    public DriverViewHolder onCreateViewHolder(@NonNull ViewGroup ViewGroup, int i) {


               View mView=LayoutInflater.from(ViewGroup.getContext()).inflate(R.layout.driver_row_item,ViewGroup,false);



        return  new DriverViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull DriverViewHolder holder, int i) {
    holder.mimageView.setImageResource(mdriverList.get(i).getDriverImage());
  holder.mdrivername.setText(mdriverList.get(i).getDriverName());
    //holder.mratingBar.setRating(mdriverList.get(RatingBar).getRatingbar());

    }

    @Override
    public int getItemCount() {
        return mdriverList.size();
    }
}
class DriverViewHolder extends RecyclerView.ViewHolder{


 CircleImageView mimageView;
    CardView mcardView;
 RatingBar mratingBar;
   TextView mdrivername;


    public DriverViewHolder( View itemView) {
        super(itemView);
        mimageView=itemView.findViewById(R.id.driverimageview);
        mcardView=itemView.findViewById(R.id.drivercardview);
        mdrivername=itemView.findViewById(R.id.TextViewDriverName);
        mratingBar=itemView.findViewById((R.id.driverRating));


    }
}