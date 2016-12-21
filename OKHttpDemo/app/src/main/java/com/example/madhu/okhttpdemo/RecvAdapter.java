package com.example.madhu.okhttpdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by MADHU on 09-12-2016.
 */

public class RecvAdapter extends RecyclerView.Adapter
{
    Context ctx;
    List<ServResponse.Search> list1;
    String s1;

    RecvAdapter(Context ctx)
    {
        this.ctx = ctx;
        Log.d("DEBUG", "RecvAdapter: constructor ");
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(ctx).inflate(R.layout.row,null,false);
        Myviewholder mvh = new Myviewholder(v);
        Log.d("DEBUG", "RecvAdapter: onCreateViewHolder ");
        return mvh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Myviewholder mh1 = (Myviewholder) holder;
        mh1.titletv.setText(list1.get(position).getTitle());
        //System.out.println(list1.get(position).getTitle());

        Picasso.with(ctx).load(list1.get(position).getPoster()).resize(500,500).into(mh1.poster);

    }

    @Override
    public int getItemCount()
    {
        if(list1==null)
        {
            return 0;
        }
        else
        {
            return list1.size();
        }
    }

    class Myviewholder extends RecyclerView.ViewHolder
    {
        TextView titletv;
        ImageView poster;
        public Myviewholder(View itemView)
        {
            super(itemView);
            titletv = (TextView)itemView.findViewById(R.id.titletv);
            poster =(ImageView) itemView.findViewById(R.id.ivposter);
        }
    }
}





