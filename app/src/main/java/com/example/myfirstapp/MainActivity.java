package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but= (Button) findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                EditText input1=(EditText) findViewById(R.id.numbEditText1);
                EditText input2=(EditText) findViewById(R.id.numbEditText2);
                TextView resultView=(TextView) findViewById(R.id.textView);
                int a=Integer.parseInt(input1.getText().toString());
                int b=Integer.parseInt(input2.getText().toString());
                int result=a+b;
                resultView.setText(""+result);
            }
        });


    }



}
