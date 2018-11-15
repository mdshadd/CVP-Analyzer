package com.example.rezve.cvp_analyzer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculation extends Activity {

    EditText u,su,v,p,f;
    TextView tvResult;
    Button c ;
    String url="";
    String str;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);
        Button c = (Button) findViewById(R.id.button1);
        u=(EditText) findViewById(R.id.editText1);
        su=(EditText) findViewById(R.id.editText2);
        p=(EditText) findViewById(R.id.editText3);
        f=(EditText) findViewById(R.id.editText4);

        c=(Button) findViewById(R.id.button1);

        c.setOnClickListener(new OnClickListener() {


            public void onClick(View v){
                if((!u.getText().toString().equals(""))&&(!su.getText().toString().equals(""))
                        &&(!p.getText().toString().equals(""))&&(!p.getText().toString().equals(""))){
                    double num1=Double.parseDouble(u.getText().toString());
                    double num2=Double.parseDouble(su.getText().toString());
                    double num3=Double.parseDouble(p.getText().toString());
                    double num4=Double.parseDouble(f.getText().toString());
                    double sale=num1*num2;
                    double cme=sale-num3;
                    double cmu=(cme/num1);
                    double bptke=num3+num4;
                    double bpue=bptke/num1;
                    double noie=cme-num4;
                    double mse=sale-bptke;
                    Intent intent;
                    intent = new Intent(Calculation.this, Display.class);
                    intent.putExtra("sal", sale);
                    intent.putExtra("bpu", bpue);
                    intent.putExtra("bptk", bptke);
                    intent.putExtra("noi", noie);
                    intent.putExtra("ms", mse);
                   // final int result=1;
                    startActivity(intent);
                }
            }
        });
    }
}