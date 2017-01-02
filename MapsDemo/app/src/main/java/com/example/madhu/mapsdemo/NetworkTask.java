package com.example.madhu.mapsdemo;

import android.os.AsyncTask;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by MADHU on 27-12-2016.
 */

public class NetworkTask extends AsyncTask
{
    GoogleMap mMap;
    NetworkTask(GoogleMap googleMap)
    {
        mMap = googleMap;
    }

    String placeurl = "https://maps.googleapis.com/maps/api/atm|rs|sjs|n/nearbysearch/json?location=12.9716,77.5946&radius=5000&type=atm&name=cruise&key=AIzaSyBD4Zet-h7nziG38zToYlEpJCg8vwsWSX4";
    List<ServResponse.Results> plist;
    ServResponse svr;

    @Override
    protected void onPostExecute(Object o)
    {
        super.onPostExecute(o);
        plist = svr.getResults();
        System.out.println(plist.get(0).getName());
        System.out.println(plist.get(1).getName());
        int i =0;
        double lat=0.0;
        double lng=0.0;
        ServResponse.Results r1=null;
        for (i = 0; i < plist.size(); i++)
        {
            MarkerOptions mop = new MarkerOptions();
            r1= plist.get(i);
            lat = r1.getGeometry().getLocation().getLat();
            lng = r1.getGeometry().getLocation().getLng();
            mop.position(new LatLng(lat,lng));
            mop.title(r1.getName());
            mMap.addMarker(mop);
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(lat,lng)));

    }

    @Override
    protected Object doInBackground(Object[] objects)
    {
        try
        {
            OkHttpClient client = new OkHttpClient();
            Request rq1 = new Request.Builder().url(placeurl).build();
            Response resp =  client.newCall(rq1).execute();
            String jsonstr = resp.body().string();

            Gson g1 = new Gson();
            svr = g1.fromJson(jsonstr,ServResponse.class);
        }
        catch (Exception e)
        {

        }
        return null;
    }
}
