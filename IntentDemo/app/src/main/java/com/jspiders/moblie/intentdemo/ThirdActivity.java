package com.jspiders.moblie.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {

    EditText inputet;
    Button sendmsgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        inputet =(EditText)findViewById(R.id.input3et);
        sendmsgbtn = (Button) findViewById(R.id.send3btn);

        sendmsgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String msg = inputet.getText().toString();
                Intent it1 = getIntent();
                it1.putExtra("key1",msg);
                setResult(1011,it1);
                finish();
            }
        });



    }
}
