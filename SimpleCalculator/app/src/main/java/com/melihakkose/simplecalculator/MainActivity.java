package com.melihakkose.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText data1;
    EditText data2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data1 =findViewById(R.id.dataText1);
        data2 =findViewById(R.id.dataText2);
        resultText=findViewById(R.id.resultText);
    }

    public void sum(View view){
        if(data1.getText().toString().matches("") || data2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }
        else{
            int number1=Integer.parseInt(data1.getText().toString());
            int number2=Integer.parseInt(data2.getText().toString());

            int result=number1+number2;
            resultText.setText("Result:"+result);
        }

    }
    public void multiply(View view){
        if(data1.getText().toString().matches("") || data2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }
        else{
            int number1=Integer.parseInt(data1.getText().toString());
            int number2=Integer.parseInt(data2.getText().toString());

            int result=number1*number2;
            resultText.setText("Result:"+result);
        }

    }
    public void deduct(View view){

        if(data1.getText().toString().matches("") || data2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }
        else{
            int number1=Integer.parseInt(data1.getText().toString());
            int number2=Integer.parseInt(data2.getText().toString());

            int result=number1-number2;
            resultText.setText("Result:"+result);
        }
    }
    public void divide(View view){

        if(data1.getText().toString().matches("") || data2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }
        else{
            int number1=Integer.parseInt(data1.getText().toString());
            int number2=Integer.parseInt(data2.getText().toString());

            int result=number1/number2;
            resultText.setText("Result:"+result);
        }
    }


}