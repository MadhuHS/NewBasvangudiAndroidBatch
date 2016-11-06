package androidsessions.weekendbatch.jspiders.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void loginclick(View v)
{
    Toast t1 = Toast.makeText(this,"Login btn",Toast.LENGTH_LONG);
    t1.show();
}
}