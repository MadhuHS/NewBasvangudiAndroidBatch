package com.jspiders.moblie.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginbtn;
    EditText usernameet,passwordet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbtn = (Button) findViewById(R.id.button);
        usernameet = (EditText) findViewById(R.id.usernameet);
        passwordet = (EditText) findViewById(R.id.passwordet);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
               String un = usernameet.getText().toString();
                String pwd = passwordet.getText().toString();

                if(un.equals("jspiders")&&pwd.equals("123"))
                {
                    Intent i1 = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(i1);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"invalid username or password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
