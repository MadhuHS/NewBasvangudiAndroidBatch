package com.example.madhu.realmdemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class SignupActivity extends AppCompatActivity {

    EditText nameet,emailet,supwdet;
    Button   savedatabtn,cancelbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        nameet  = (EditText) findViewById(R.id.nameet);
        emailet = (EditText) findViewById(R.id.emailet);
        supwdet = (EditText) findViewById(R.id.supwdet);

        savedatabtn = (Button)findViewById(R.id.savedatabtn);
        cancelbtn   = (Button)findViewById(R.id.cancelbtn);

        savedatabtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //User u1 = new User();
                String name = nameet.getText().toString();
                //u1.setName(name);

                String email = emailet.getText().toString();
                //u1.setEmail(email);

                String pwd = supwdet.getText().toString();
                //u1.setPassword(pwd);

                Realm.init(SignupActivity.this);
                boolean add = DatabaseTask.addUser(name,email,pwd);
                if (add==true)
                {
                    Toast.makeText(SignupActivity.this, "Success", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Toast.makeText(SignupActivity.this, "Invalid Data", Toast.LENGTH_SHORT).show();
                }

             finish();
            }
        });

        cancelbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });

    }
}
