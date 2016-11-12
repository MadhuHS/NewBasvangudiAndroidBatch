package androidsessions.weekendbatch.jspiders.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static androidsessions.weekendbatch.jspiders.converter.Converters.toKilometers;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    EditText meteret,kilometeret;
    Button convertbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        meteret = (EditText)findViewById(R.id.meterset);
        kilometeret = (EditText)findViewById(R.id.kilometeret);
        convertbtn=(Button)findViewById(R.id.convertbtn);
        convertbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Editable etb1 = meteret.getText();
        Editable etb2 = kilometeret.getText();
        String s1 = etb1.toString();
        String s2 = etb2.toString();

        if(s1.length()==0&&s2.length()==0)
        {
           meteret.setError("invalid value");
            kilometeret.setError("invalid value");
        }

        else if(s1.length()!=0&&s2.length()!=0)
        {
            meteret.setError("invalid value");
            kilometeret.setError("invalid value");
        }
        else if(s1.length()!=0&&s2.length()==0)
        {
            String res = Converters.toKilometers(s1);
            kilometeret.setText(res);
        }
        else
        {
            String res = Converters.tometers(s2);
            meteret.setText(res);
        }

    }
}
