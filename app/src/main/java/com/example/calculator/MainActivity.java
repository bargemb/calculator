package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;

    private Button add;
    private Button sub;
    private Button mul;
    private Button div;

    private Button clear;
    private Button sign;
    private Button percentage;
    private Button decimal;
    private Button equal;

    private TextView control;
    private TextView result;

    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUAL = 0;

    private double num1 = Double.NaN;
    private double num2;
    private char operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + "9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                operator = ADDITION;
                result.setText(String.valueOf(num1)+ "+");
                control.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                operator = SUBTRACTION;
                result.setText(String.valueOf(num1)+ "-");
                control.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                operator = MULTIPLICATION;
                result.setText(String.valueOf(num1)+ "*");
                control.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                operator = DIVISION;
                result.setText(String.valueOf(num1)+ "/");
                control.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                operator = EQUAL;
                result.setText(result.getText().toString() + String.valueOf(num2) + "=" + String.valueOf(num1));
                control.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.NaN;
                num2 = Double.NaN;
                control.setText(null);
                result.setText(null);

            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText().toString() + ".");
            }
        });

    }

    private void calculate(){
        if(!Double.isNaN(num1)){
            num2 = Double.parseDouble(control.getText().toString());
            switch (operator){
                case ADDITION:
                    num1 = num1 + num2;
                    break;
                case SUBTRACTION:
                    num1 = num1 - num2;
                    break;
                case MULTIPLICATION:
                    num1 = num1 * num2;
                    break;
                case DIVISION:
                    num1 = num1 / num2;
                    break;
                case EQUAL:
                    break;
            }
        }
        else {
            num1 = Double.parseDouble(control.getText().toString());
        }
    }

    private void setupUIViews(){
        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);

        add = (Button)findViewById(R.id.btnAdd);
        sub = (Button)findViewById(R.id.btnSub);
        mul = (Button)findViewById(R.id.btnMul);
        div = (Button)findViewById(R.id.btnDiv);

        clear = (Button)findViewById(R.id.btnClr);
        sign =  (Button)findViewById(R.id.btnSign);
        percentage = (Button)findViewById(R.id.btnPerc);
        decimal =  (Button)findViewById(R.id.btnDec);
        equal =  (Button)findViewById(R.id.btnEq);

        control = (TextView) findViewById(R.id.tvCtrl);
        result = (TextView)findViewById(R.id.tvRes);


    }
}
