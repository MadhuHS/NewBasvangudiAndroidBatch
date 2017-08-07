package com.aquamax.viralshare;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
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

public class SignUpActivity extends AppCompatActivity {

    private Button signupbtn;
    private EditText emailedt,passwordedt,cnfpasswordedt;
    private FirebaseAuth auth;

    private String stemail;
    private String stpassword ;
    private String stcnfpassword;
    private View mProgressView;
    private ConstraintLayout layout;
    private View signupview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        auth = FirebaseAuth.getInstance();
        signupbtn = (Button)findViewById(R.id.signup_button_signup);
        emailedt =  (EditText)findViewById(R.id.signup_edittext_EmailAddress);
        passwordedt =  (EditText)findViewById(R.id.signup_edittext_password);
        cnfpasswordedt =  (EditText)findViewById(R.id.signup_editText_cnfpassword);
        layout = (ConstraintLayout)findViewById(R.id.sign_up_layout);
        mProgressView = findViewById(R.id.signup_progress);
        signupview = findViewById(R.id.sign_up_form);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {   showProgress(true);
                stemail = emailedt.getText().toString();
                stpassword = passwordedt.getText().toString();
                stcnfpassword = cnfpasswordedt.getText().toString();
                boolean allok = vaildate_fields();
                if(allok)
                {
                  auth.createUserWithEmailAndPassword(stemail,stpassword)
                          .addOnCompleteListener(new OnCompleteListener<AuthResult>()
                          {
                              @Override
                              public void onComplete(@NonNull Task<AuthResult> task)
                              {

                                  if(task.isSuccessful())
                                  {
                                      showProgress(false);
                                      finish();
                                  }

                                  else
                                  {
                                      String error = task.getException().getMessage();
                                      showProgress(false);
                                      Toast.makeText(SignUpActivity.this,error,Toast.LENGTH_SHORT).show();
                                  }

                              }
                          });
                }

            }
        });
    }

    /**
     * Shows the progress UI and hides the login form.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    private void showProgress(final boolean show) {
        // On Honeycomb MR2 we have the ViewPropertyAnimator APIs, which allow
        // for very easy animations. If available, use these APIs to fade-in
        // the progress spinner.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            int shortAnimTime = getResources().getInteger(android.R.integer.config_shortAnimTime);

            signupview.setVisibility(show ? View.GONE : View.VISIBLE);
            signupview.animate().setDuration(shortAnimTime).alpha(
                    show ? 0 : 1).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    layout.setVisibility(show ? View.GONE : View.VISIBLE);
                }
            });

            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            mProgressView.animate().setDuration(shortAnimTime).alpha(
                    show ? 1 : 0).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
                }
            });
        } else {
            // The ViewPropertyAnimator APIs are not available, so simply show
            // and hide the relevant UI components.
            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            layout.setVisibility(show ? View.GONE : View.VISIBLE);
        }
    }

    public boolean vaildate_fields()
    {
        if (stemail==null||stpassword==null||stcnfpassword==null)
        {
            Snackbar.make(layout,"Please fill all details",Snackbar.LENGTH_LONG).show();
            return false;
        }
        else if(stemail.contains("@")==false)
        {
            Snackbar.make(layout,"invalid email",Snackbar.LENGTH_LONG).show();
            return false;
        }

        else if(stpassword.length()<6)
        {
            Snackbar.make(layout,"password should be more than 6 characters",Snackbar.LENGTH_LONG).show();
            return false;
        }

        else if (stpassword.equals(stcnfpassword) == false)
        {
            Snackbar.make(layout,"Passwords dont match",Snackbar.LENGTH_LONG).show();
            return false;
        }

        return true;

    }
}
