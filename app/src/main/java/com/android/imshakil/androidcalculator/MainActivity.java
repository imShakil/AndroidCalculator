package com.android.imshakil.androidcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvres;
    private Button eql, dot, sin, cos, tan, clr, add, sub, mul, div;
    private Button zero, one, two, three, four, five, six, seven, eight, nine;
    private Button devInfo, exit;

    private String info = "Invalid Input!";
    private String cinfo = "Clear previous calculation!";

    boolean b_add, b_sub, b_div, b_mul, b_sin, b_cos, b_tan, bsct, b_clr;
    double var1, var2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvres =  findViewById(R.id.tvres);
        sin   =  findViewById(R.id.btnsin);
        cos   =  findViewById(R.id.btncos);
        tan   =  findViewById(R.id.btntan);
        dot   =  findViewById(R.id.btndot);
        eql   =  findViewById(R.id.btneql);
        clr   =  findViewById(R.id.btnclr);
        add   =  findViewById(R.id.btnadd);
        sub   =  findViewById(R.id.btnsub);
        mul   =  findViewById(R.id.btnmul);
        div   =  findViewById(R.id.btndiv);
        devInfo   =  findViewById(R.id.btnemp);
        exit  =  findViewById(R.id.btnoff);

        zero  =  findViewById(R.id.btn0);
        one   =  findViewById(R.id.btn1);
        two   =  findViewById(R.id.btn2);
        three =  findViewById(R.id.btn3);
        four  =  findViewById(R.id.btn4);
        five  =  findViewById(R.id.btn5);
        six   =  findViewById(R.id.btn6);
        seven =  findViewById(R.id.btn7);
        eight =  findViewById(R.id.btn8);
        nine  =  findViewById(R.id.btn9);

        tvres.setText(null);
        var1 = var2 = 0;
        b_clr = true;

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        devInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutMe.class);
                startActivity(intent);

            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvres.setText(null);
                var1=var2=0;
                b_add=b_div=b_mul=b_sub=bsct=false;
                b_clr=true;
            }
        });

        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (b_clr == true) tvres.setText(tvres.getText()+"0");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });

        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (b_clr == true) tvres.setText(tvres.getText()+"1");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (b_clr == true) tvres.setText(tvres.getText()+"2");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (b_clr == true) tvres.setText(tvres.getText()+"3");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();

            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (b_clr == true) tvres.setText(tvres.getText()+"4");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (b_clr == true) tvres.setText(tvres.getText()+"5");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });

        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (b_clr == true) tvres.setText(tvres.getText()+"6");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (b_clr == true) tvres.setText(tvres.getText()+"7");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (b_clr == true) tvres.setText(tvres.getText()+"8");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (b_clr == true) tvres.setText(tvres.getText()+"9");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b_clr == true) tvres.setText(tvres.getText()+".");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (bsct != true) {
                    tvres.setText("sin(");
                    bsct = true;
                    b_sin = true;
                    b_clr = true;
                }
                else
                {
                    Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                }
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bsct != true) {
                    tvres.setText("cos(");
                    bsct = true;
                    b_cos = true;
                    b_clr = true;
                }
                else
                {
                    Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                }
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bsct != true) {
                    tvres.setText("tan(");
                    bsct = true;
                    b_tan = true;
                    b_clr = true;
                }
                else
                {
                    Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {

                String num = tvres.getText().toString();

                if(!(num.equals("")) && bsct!=true)
                {
                    tvres.setText(tvres.getText().toString());
                    var1 = Double.parseDouble(tvres.getText().toString());
                    b_add = true;
                    tvres.setText(null);
                }
                else Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                b_clr = true;
            }
        });
        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {

                String num = tvres.getText().toString();

                if(!(num.equals("")) && bsct != true)
                {
                    var1 = Double.parseDouble(tvres.getText()+"");
                    b_sub = true;
                    tvres.setText(null);
                }
                else Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                b_clr = true;
            }
        });

        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                String num = tvres.getText().toString();
                if(!(num.equals("")) && bsct != true)
                {
                    var1 = Double.parseDouble(tvres.getText()+"");
                    b_mul = true;
                    tvres.setText(null);
                }
                else Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                b_clr = true;
            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                String num = tvres.getText().toString();
                if(!(num.equals("")) && bsct != true)
                {
                    var1 = Double.parseDouble(tvres.getText()+"");
                    b_div = true;
                    tvres.setText(null);
                }
                else Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                b_clr = true;
            }
        });

        eql.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                String str = tvres.getText().toString();
                var2 = var1;

                if (!(str.equals("")) && (bsct == true))
                {
                    var1 = var2 = 0;

                    if (b_sin == true)
                    {
                        str = str.replace("sin(", "");
                        var1 = Double.parseDouble(str+ "");
                        var2 = Math.sin(Math.toRadians(var1));
                        b_sin = false;
                    }

                    if (b_cos == true)
                    {
                        str = str.replace("cos(", "");
                        var1 = Double.parseDouble(str+"");
                        var2 = Math.cos(Math.toRadians(var1));
                        b_cos = false;
                    }

                    if (b_tan == true)
                    {
                        str = str.replace("tan(", "");
                        var1 = Double.parseDouble(str+"");
                        var2 = Math.tan(Math.toRadians(var1));
                        b_tan = false;
                    }
                    tvres.setText(var2+"");
                    var2 = 0;
                    bsct = false;
                }
                else if (!(str.equals("")) && bsct == false)
                {
                    var1 = Double.parseDouble(tvres.getText().toString());
                    if (b_add == true)
                    {
                        var1 += var2;
                        b_add = false;
                    }

                    if (b_sub == true)
                    {
                        var1 = var2 - var1;
                        b_sub = false;
                    }
                    if (b_mul == true)
                    {
                        var1 *= var2;
                        b_mul = false;
                    }

                    if (b_div == true)
                    {
                        var1 = var2 / var1;
                        b_div = false;
                    }
                    tvres.setText(var1 + "");
                    b_clr = false;
                }
                else Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
            }
        });
    }
}
