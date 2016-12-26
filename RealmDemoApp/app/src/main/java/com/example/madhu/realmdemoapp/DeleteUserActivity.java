package com.example.madhu.realmdemoapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import io.realm.Realm;
import io.realm.RealmResults;

public class DeleteUserActivity extends AppCompatActivity {

    EditText deluseremailet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        deluseremailet =(EditText)findViewById(R.id.deleteuseremailet);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String email = deluseremailet.getText().toString();
                Realm.init(DeleteUserActivity.this);
                boolean delete = DatabaseTask.deleteUser(email);
                if(delete==true)
                {
                    Snackbar.make(view,"user deleted", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    Snackbar.make(view,"invalid email", Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }

}
