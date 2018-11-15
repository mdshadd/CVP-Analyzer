package com.example.rezve.cvp_analyzer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Display extends Activity {
    TextView textView1,textView2,textView3,textView4,textView5,textView6;
    protected void onCreate(Bundle savedInstancestate)
    {
        //final double itsAfterDecimalPoint=2;
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_display);
        Button b =(Button) findViewById(R.id.button2);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        Intent in = this.getIntent();

        double sale = in.getDoubleExtra("sal",0.00);

        double bpue = in.getDoubleExtra("bpu",0.00);

        double bptke = in.getDoubleExtra("bptk",0.00);

        final double noie = in.getDoubleExtra("noi",0.00);

        double mse = in.getDoubleExtra("ms",0.00);



        textView1.setText("Total Sales : "+"\n" +String.format("%.2f", sale) );
        textView2.setText("Break-Even Point(Units) : " +"\n" + String.format("%.0f", bpue) );
        textView3.setText("Break-Even Point(Cash) : " +"\n" +String.format("%.2f", bptke) );
        textView4.setText("Net Operating Income : " +"\n" +String.format("%.2f", noie) );
        textView5.setText("Margin of Safety : " +"\n" +String.format("%.2f", mse) );

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Display.this, Analysis.class);
                intent.putExtra("noi", noie);
                startActivity(intent);
            }
        });
        }

    }






