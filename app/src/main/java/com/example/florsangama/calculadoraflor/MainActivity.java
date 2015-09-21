package com.example.florsangama.calculadoraflor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    EditText num1, num2;
    Button suma, resta, mult, div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        suma = (Button)findViewById(R.id.suma);
        resta = (Button)findViewById(R.id.resta);
        mult = (Button)findViewById(R.id.mult);
        div = (Button)findViewById(R.id.div);
        result = (TextView)findViewById(R.id.result);


        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int res = n1+n2;
                result.setText("Resultado: "+res);
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int res = n1-n2;
                result.setText("Resultado: "+res);
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int res = n1*n2;
                result.setText("Resultado: "+res);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int res = n1/n2;
                result.setText("Resultado: "+res);
            }
        });


    }


}