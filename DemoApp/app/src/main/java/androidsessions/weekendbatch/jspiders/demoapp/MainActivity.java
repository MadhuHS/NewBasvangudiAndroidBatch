package androidsessions.weekendbatch.jspiders.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    String username=null;
    String password=null;

    String stUsername="jspiders";
    String stPassword ="user123";

    Button loginbtn;
    Button cancelbtn;
    EditText usernameet;
    EditText passwordet;
    TextView errormsgtv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbtn =(Button) findViewById(R.id.loginbtn);
        cancelbtn = (Button) findViewById(R.id.cancelbtn);
        usernameet =(EditText) findViewById(R.id.usernameet);
        passwordet = (EditText)findViewById(R.id.passwordet);
        errormsgtv = (TextView)findViewById(R.id.messagetv);
    }

    public void loginclick(View v)
    {
         Editable et1 = usernameet.getText();
         username = et1.toString();

         Editable et2 = passwordet.getText();
         password = et2.toString();

        if(stUsername.equals(username)&&stPassword.equals(password))
        {
            /*Toast t1 = Toast.makeText(this,"Login Success",Toast.LENGTH_LONG);
            t1.show();*/
            errormsgtv.setText("Login Success");
        }
        else
        {
            /*Toast t2 = Toast.makeText(this,"Invalid username or password",Toast.LENGTH_LONG);
            t2.show();*/
            errormsgtv.setText("Error!! Invalid user or paswword");
        }
    }

    public void cancelclick(View v)
    {
        Toast t2 = Toast.makeText(this,"Clicked on Cancel button",Toast.LENGTH_LONG);
        t2.show();
    }
}
