package com.example.madhu.realmdemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class UpdateProfileActivity extends AppCompatActivity
{

    EditText confirmemail,newpwd,confirmpwd;
    Button updatebtn;
    boolean update;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        confirmemail = (EditText) findViewById(R.id.confirmemailet);
        newpwd = (EditText) findViewById(R.id.newpasswordet);
        confirmpwd = (EditText) findViewById(R.id.confirmpasswordet);
        updatebtn = (Button)findViewById(R.id.updatebtn);

        updatebtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String cnemail = confirmemail.getText().toString();
                String newpassword = newpwd.getText().toString();
                String cnpwd = confirmpwd.getText().toString();

                if(newpassword.equals(cnpwd))
                {
                    Realm.init(UpdateProfileActivity.this);
                    update = DatabaseTask.updateuser(cnemail,newpassword);
                }

                else
                {
                    Toast.makeText(UpdateProfileActivity.this,"password do not match",Toast.LENGTH_SHORT).show();
                }

                if(update==true)
                {
                    Toast.makeText(UpdateProfileActivity.this,"password updated",Toast.LENGTH_SHORT).show();
                    finish();
                }

            }
        });

    }
}
