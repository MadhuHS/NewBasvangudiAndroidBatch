package com.jspiders.moblie.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button sendbtn;
    EditText inputet;
    Button getmsgbtn;
    TextView outputtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendbtn = (Button) findViewById(R.id.button);
        inputet = (EditText) findViewById(R.id.inputet);
        getmsgbtn =(Button)findViewById(R.id.getmsgbtn);
        outputtv = (TextView) findViewById(R.id.outputtv);
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String msg = inputet.getText().toString();
                Intent i1 = new Intent(MainActivity.this,SecondActivity.class);
                i1.putExtra("key1",msg);
                startActivity(i1);
            }
        });

        getmsgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i2 = new Intent(MainActivity.this,ThirdActivity.class);
                startActivityForResult(i2,100);
            }
        });
    }

    @Override
    protected void onActivityResult
            (int requestCode, int resultCode, Intent data)
    {
      String s1 = data.getStringExtra("key1");
        outputtv.setText(s1);
    }
}
