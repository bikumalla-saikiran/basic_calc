package com.example.saikiran.eclipse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    TextView t1; double v1,v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.num1);
        e2=findViewById(R.id.num2);
        t1=findViewById(R.id.res);

    }
    public void onclick(View v)
    {
        v1=Double.parseDouble(e1.getText().toString());
        v2=Double.parseDouble(e2.getText().toString());
        switch(v.getId())
        {
            case R.id.add : t1.setText(v1+v2+"");break;
            case R.id.sub : t1.setText(v1-v2+"");break;
            case R.id.mul : t1.setText(v1*v2+"");break;
            case R.id.div : t1.setText(v1/v2+"");break;
        }
    }
}
