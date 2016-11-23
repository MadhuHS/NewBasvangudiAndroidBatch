package com.jspiders.moblie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startbtn =(Button)findViewById(R.id.startbtn);

        startbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i1 = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i1);
            }
        });
    }
}
