package androidsessions.weekendbatch.jspiders.buttondemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener
{
    Button redbtn;
    Button bluebtn;
    Button greenbtn;
    TextView messagetv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redbtn =(Button)findViewById(R.id.redbtn);
        bluebtn = (Button) findViewById(R.id.bluebtn);
        greenbtn = (Button) findViewById(R.id.greenbtn);
        messagetv = (TextView) findViewById(R.id.messagetv);

        redbtn.setOnClickListener(this);
        bluebtn.setOnClickListener(this);
        greenbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        int id = v.getId();

        switch (id)
        {
            case R.id.redbtn   :  messagetv.setText("Red Button");
                                  break;
            case R.id.greenbtn :  messagetv.setText("Green Button");
                                  break;
            case R.id.bluebtn  :  messagetv.setText("Blue Button");
                                  break;
        }
    }
}
