package com.example.rezve.cvp_analyzer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Analysis extends Activity {

    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        textView1 = (TextView) findViewById(R.id.textView1);
        Intent in = getIntent();
        final double noie = in.getDoubleExtra("noi",0.00);
        if(noie<0)
        {
            textView1.setText("Sorry. You will fail to make by following this policy. " +
                    "Rearrange your all cost and sales price.");
        }
        else if (noie>0)
        {
            textView1.setText("Congratulations. Your idea will work successfully. Ensure proper execution of your plan.");
        }
        else
        {
            textView1.setText("Your idea needs to rethink. You will not make profit from this policy. " +
                    "Rearrange your all cost and sales price.");
        }

    }
}
