package com.example.madhu.mapsdemo;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        mMap = googleMap;
        int i =0;
        Place p1=null;
        ArrayList<Place> plist = new ArrayList<Place>();
        plist.add(new Place(12.9716,77.5946,"Bangalore"));
        plist.add(new Place(12.2958,76.6394,"Mysore"));
        plist.add(new Place(28.7041,77.1025,"Delhi"));
        plist.add(new Place(19.0760,72.8777,"Mumbai"));
        plist.add(new Place(13.0827,80.2707,"Chennai"));
       /* LatLng[] ref= new LatLng[5];
        ref[0] = new LatLng(12.9716,77.5946);
        ref[1] = new LatLng(12.2958,76.6394);
        ref[2] = new LatLng(28.7041,77.1025);
        ref[3] = new LatLng(19.0760,72.8777);
        ref[4] = new LatLng(13.0827,80.2707);*/
        // Add a marker in Sydney and move the camera
        for (i = 0; i < plist.size(); i++)
        {
            MarkerOptions mop = new MarkerOptions();
            p1= plist.get(i);
            mop.position(new LatLng(p1.getLat(),p1.getLng()));
            mop.title(plist.get(i).getName());
            BitmapDescriptor b1 = BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher);
            mop.icon(b1);
            mMap.addMarker(mop);
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(p1.getLat(),p1.getLng())));

    }






}
