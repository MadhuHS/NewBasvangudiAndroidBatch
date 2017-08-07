package com.aquamax.viralshare;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

/**
 * Created by MADHU on 21-04-2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter
{
    private DatabaseReference mDatabaseReference;
    RecyclerViewAdapter(DatabaseReference mdDatabaseReference)
    {
        this.mDatabaseReference = mdDatabaseReference;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView picshomeimageview;

        public MyViewHolder(View view)
        {
            super(view);
            picshomeimageview = (ImageView) view.findViewById(R.id.title);
        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_home, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
    {

    }

    @Override
    public int getItemCount()
    {
        return 24;
    }
}
