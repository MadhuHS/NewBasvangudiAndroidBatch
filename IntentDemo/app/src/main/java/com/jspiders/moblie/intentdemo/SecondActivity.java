package com.jspiders.moblie.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView msgtv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        msgtv =(TextView)findViewById(R.id.msgtv);

        Intent int1 = getIntent();
        String s1 = int1.getStringExtra("key1");
        if(s1.isEmpty()!=true)
        {
            msgtv.setText(s1);
        }
    }
}
