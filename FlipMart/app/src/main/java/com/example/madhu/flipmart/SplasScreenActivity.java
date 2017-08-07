package com.example.madhu.flipmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplasScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas_screen);
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(5000);
                    Intent i1 = new Intent(SplasScreenActivity.this,HomeActivity.class);
                    startActivity(i1);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
