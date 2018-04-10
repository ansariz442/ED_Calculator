package com.engineersdream.ed_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2;
    Button add, sub, mul, div;
    TextView text;
    String str1, str2;
    int num1, num2, result;
    float fl1, fl2, flresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.editText);
        edt2 = (EditText) findViewById(R.id.editText2);
        add = (Button) findViewById(R.id.addition);
        sub = (Button) findViewById(R.id.substraction);
        mul = (Button) findViewById(R.id.multiplication);
        div = (Button) findViewById(R.id.division);
        text = (TextView) findViewById(R.id.textView2);
    }

    public void addclick(View v)
    {
        calculation();
        result = num1 + num2;

        text.setText(""+result);
    }

    public void subclick(View v)
    {
        calculation();

        result = num1 - num2;

        text.setText(""+result);
    }

    public void mulclick(View v)
    {
        calculation();

        result = num1 * num2;

        text.setText(""+result);
    }

    public void divclick(View v)
    {
        str1 = edt1.getText().toString();
        str2 = edt2.getText().toString();

        fl1 = Integer.parseInt(str1);
        fl2 = Integer.parseInt(str2);

        flresult = fl1 / fl2;

        text.setText(""+flresult);
    }

    public void calculation()                  //METHOD OR FUNCTION DECLARATION OR DEFINATION
    {
        str1 = edt1.getText().toString();
        str2 = edt2.getText().toString();

        num1 = Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);
    }
}
