package com.example.pro_ahmed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edittext,editText2;
    private TextView textView2;

    private Button buttonsum;
    private Button buttonsub;
    private Button buttondiv;
    private Button buttonmul;
    private Button Bu_C;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        edittext=(EditText) findViewById(R.id.editText);
        editText2=(EditText) findViewById(R.id.editText2);
        textView2=(TextView) findViewById(R.id.textView2);
        buttonsum=(Button)findViewById(R.id.buttonsum);
        buttonsub=(Button)findViewById(R.id.buttonsub);
        buttondiv=(Button)findViewById(R.id.buttondiv);
        buttonmul=(Button)findViewById(R.id.buttonmul);
        Bu_C=(Button)findViewById((R.id.Bu_C));
    }

    public void showsum(View v) {
        buttonsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=edittext.getText().toString();
                String value2=editText2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a+b;
                textView2.setText(String.valueOf(sum));
                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();

            }
        });
    }

    public void sub(View v) {
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=edittext.getText().toString();
                String value2=editText2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sub=a-b;
                textView2.setText(String.valueOf(sub));
                Toast.makeText(getApplicationContext(),String.valueOf(sub),Toast.LENGTH_LONG).show();

            }
        });
    }

    public void div(View v) {
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=edittext.getText().toString();
                String value2=editText2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int div=a/b;
                textView2.setText(String.valueOf(div));
                Toast.makeText(getApplicationContext(),String.valueOf(div),Toast.LENGTH_LONG).show();

            }
        });
    }

    public void showmul(View v) {
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=edittext.getText().toString();
                String value2=editText2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int mult=a*b;
                textView2.setText(String.valueOf(mult));
                Toast.makeText(getApplicationContext(),String.valueOf(mult),Toast.LENGTH_LONG).show();

            }
        });
    }
    public void cler(View v) {

        edittext.setText("");
        editText2.setText("");
        textView2.setText("");


    }

}
