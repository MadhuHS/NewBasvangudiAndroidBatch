package com.example.madhu.realmdemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmResults;

public class LoginActivity extends AppCompatActivity {

    EditText usernameet, pwdet;
    Button loginbtn, signupbtn;
    boolean match = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameet = (EditText) findViewById(R.id.unet);
        pwdet = (EditText) findViewById(R.id.pwdet);
        loginbtn = (Button) findViewById(R.id.loginbtn);
        signupbtn = (Button) findViewById(R.id.signupnbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String entusername = usernameet.getText().toString();
                String entpassword = pwdet.getText().toString();

                Realm.init(LoginActivity.this);
                RealmResults<User> res1 = DatabaseTask.getUserDet(entusername);
                match = checkUnpwd(res1, entusername, entpassword);
                if (match == true)
                {
                    Intent i1 = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(i1);
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }

            }
        });


        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(i1);
            }
        });
    }

    public boolean checkUnpwd(RealmResults<User> res1, String entusername, String entpassword) {
        {
            for (int i = 0; i < res1.size(); i++)
            {
                User u1 = res1.get(i);
                String stemail = u1.getEmail();
                String stpwd = u1.getPassword();
                Toast.makeText(LoginActivity.this, res1.size() + " records found", Toast.LENGTH_SHORT).show();

                if (entusername.equals(stemail) && entpassword.equals(stpwd))
                {
                    return true;
                } else
                {
                    return false;
                }
            }
        }
         return false;
        }
    }
