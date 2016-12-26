package com.example.madhu.sharedprefdemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usnet,pwdet;
    CheckBox rmpcb;
    Button loginbtn;
    String stemail = "jspiders@gmail.com";
    String stpwd = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usnet = (EditText)  findViewById(R.id.usnet);
        pwdet = (EditText)  findViewById(R.id.pwdet);
        rmpcb = (CheckBox)  findViewById(R.id.rmpcb);
        loginbtn = (Button) findViewById(R.id.loginbtn);

        SharedPreferences sp1 = getSharedPreferences("MyPref",MODE_PRIVATE);
        String s1 = sp1.getString("key1",null);
        String s2 = sp1.getString("key2",null);
        Log.d("DEBUG","USERNAME --> "+s1);
        Log.d("DEBUG","PASSWORD --> "+s2);
        usnet.setText(s1);
        pwdet.setText(s2);

        loginbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String entemail = usnet.getText().toString();
                String entpwd   = pwdet.getText().toString();

                if(entemail.equals(stemail)&&entpwd.equals(stpwd))
                {
                    if(rmpcb.isChecked()==true)
                    {
                        Log.d("DEBUG","ENTUSERNAME --> "+entemail);
                        Log.d("DEBUG","ENTPASSWORD --> "+entpwd);
                        SharedPreferences sp1 = getSharedPreferences("MyPref", MODE_PRIVATE);

                        sp1.edit().putString("key1", entemail);
                        sp1.edit().putString("key2", entpwd);
                        sp1.edit().commit();
                        Intent i1 = new Intent(MainActivity.this,HomeActivity.class);
                        startActivity(i1);
                    }

                    else
                    {
                        Intent i2 = new Intent(MainActivity.this,HomeActivity.class);
                        startActivity(i2);
                    }
                }

                else
                {
                    Toast.makeText(MainActivity.this,"Invalid Username or Password",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
