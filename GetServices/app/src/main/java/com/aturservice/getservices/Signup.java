package com.aturservice.getservices;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Signup extends AppCompatActivity
{
    private Button signupbtn;
    private EditText signupemail,signpasswordedittext,cnfpasswordedittext;
    private FirebaseAuth auth;
    String email;
    String password;
    String reppassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        auth =FirebaseAuth.getInstance();
        signupbtn = (Button) findViewById(R.id.buttonsignup);
        signupemail = (EditText) findViewById(R.id.editText_sign_up_EmailAddress);
        signpasswordedittext = (EditText) findViewById(R.id.editText_sign_up_password);
        cnfpasswordedittext = (EditText) findViewById(R.id.editText_sign_up_cnf_password);



        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                email = signupemail.getText().toString();
                password = signpasswordedittext.getText().toString();
                reppassword = cnfpasswordedittext.getText().toString();

                if (password.equals(reppassword))
                {
                    auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(Signup.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task)
                        {
                            if(task.isSuccessful())
                            {
                                Toast.makeText(Signup.this,"user created",Toast.LENGTH_SHORT).show();
                                finish();
                            }
                            else
                            {
                                Toast.makeText(Signup.this,"error while registering try again",Toast.LENGTH_SHORT).show();

                            }
                        }
                    });
                }

                else
                {
                    Toast.makeText(Signup.this,"Passowrd dont match",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
