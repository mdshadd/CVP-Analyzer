package com.example.rezve.cvp_analyzer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageButton androidImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidImageButton = (ImageButton) findViewById(R.id.button1);
        androidImageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               Intent intentLownewActivity=(new Intent(MainActivity.this,Calculation.class));

                startActivity(intentLownewActivity);
                }





            });



    }
}

