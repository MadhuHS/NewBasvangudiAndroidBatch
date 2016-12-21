package com.example.madhu.okhttpdemo;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {

    RecyclerView rvmovies;
    List<ServResponse.Search> list1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvmovies = (RecyclerView)findViewById(R.id.rvmovies);
        LinearLayoutManager mgr1 = new LinearLayoutManager(MainActivity.this);
        mgr1.setOrientation(mgr1.VERTICAL);
        rvmovies.setLayoutManager(mgr1);

        RecvAdapter adp = new RecvAdapter(MainActivity.this);
        NetworkTask t1 = new NetworkTask(adp);
        t1.execute();
        rvmovies.setAdapter(adp);
    }
}

class NetworkTask extends AsyncTask
{
    String jsonstr;
    RecvAdapter adp;

    NetworkTask(RecvAdapter adp)
    {
        this.adp = adp;
    }

    @Override
    protected Object doInBackground(Object[] objects)
    {
        try
        {
            OkHttpClient client = new OkHttpClient();
            Request rq = new Request.Builder().url("https://www.omdbapi.com/?s=Batman&page=2").build();
            Response resp  = client.newCall(rq).execute();
            jsonstr = resp.body().string();
            Gson g1 = new Gson();
            ServResponse ser1 = g1.fromJson(jsonstr,ServResponse.class);
            adp.list1 = ser1.getSearch();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }


}