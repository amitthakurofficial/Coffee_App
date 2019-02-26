package com.example.class_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int count=0;
    TextView counter;

    Button plus, minus;
    Button order,reset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus=findViewById(R.id.button2);
        minus=findViewById(R.id.button3);
        order=findViewById(R.id.button4);
        reset=findViewById(R.id.button7);

        counter=findViewById(R.id.textView6);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                counter.setText(String.valueOf(count));

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count--;
                counter.setText(String.valueOf(count));

            }
        });


        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count<1)
                {
                    Toast.makeText(MainActivity.this,"order please",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this,"your bill is"+String.valueOf(count*10),Toast.LENGTH_SHORT).show();
                }


            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count > 1)
                {
                    count=0;
                    counter.setText(String.valueOf(count));
                }

            }
        });

    }

}
