
package com.example.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText number1;
    private EditText number2;
    private Button Add;
    private TextView Result;
    private Button Subtract;
    private Button Divide;
    private Button Multiply;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number1 = (EditText)findViewById(R.id.editNum1);
        number2 = (EditText)findViewById(R.id.editNum2);
        Add = (Button)findViewById(R.id.buttonAdd);
        Result = (TextView)findViewById(R.id.Result1);
        Divide = (Button)findViewById(R.id.buttonDivid);
        Subtract = (Button)findViewById(R.id.buttonSubs);
        Multiply = (Button)findViewById(R.id.buttonMulti);



        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double numb1 =0;
                double numb2 =0;

                if(number1.getText().toString().isEmpty()){

                     numb1=0;

                }else{

                     numb1 = Double.parseDouble(number1.getText().toString());

                }

                if(number2.getText().toString().isEmpty()){

                     numb2=0;

                }
                else{

                     numb2 = Double.parseDouble(number2.getText().toString());

                }

                double sum = numb1 + numb2;
                Result.setText("Result: "+ String.valueOf(sum));


            }


        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double numb1=0;
                double numb2=0;

                if(number1.getText().toString().isEmpty()){

                     numb1=0;

                }else{

                     numb1 = Double.parseDouble(number1.getText().toString());

                }

                if(number2.getText().toString().isEmpty()){

                     numb2=0;

                }
                else{

                     numb2 = Double.parseDouble(number2.getText().toString());

                }
                double divide = numb1 / numb2;
                Result.setText("Result: "+ String.valueOf(divide));

            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double numb1=0;
                double numb2=0;

                if(number1.getText().toString().isEmpty()){

                     numb1=0;

                }else{

                     numb1 = Double.parseDouble(number1.getText().toString());

                }

                if(number2.getText().toString().isEmpty()){

                     numb2=0;

                }
                else{

                     numb2 = Double.parseDouble(number2.getText().toString());

                }
                double multiply = numb1*numb2;
                Result.setText("Result: "+ String.valueOf(multiply));


            }
        });


        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double numb1=0;
                double numb2=0;

                if(number1.getText().toString().isEmpty()){

                     numb1=0;

                }else{

                     numb1 = Double.parseDouble(number1.getText().toString());

                }

                if(number2.getText().toString().isEmpty()){

                     numb2=0;

                }
                else{

                     numb2 = Double.parseDouble(number2.getText().toString());

                }
                double subtract = numb1-numb2;
                Result.setText("Result: "+ String.valueOf(subtract));

            }
        });
    }
}
