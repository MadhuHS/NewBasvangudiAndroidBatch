package com.example.madhu.realmdemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.options,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.option1 :
               // Toast.makeText(HomeActivity.this,"Edit profile",Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(HomeActivity.this,UpdateProfileActivity.class);
                startActivity(i1);
                break;

            case R.id.option2 :
                //Toast.makeText(HomeActivity.this,"Help",Toast.LENGTH_SHORT).show();
                Intent i2 = new Intent(HomeActivity.this,DeleteUserActivity.class);
                startActivity(i2);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
