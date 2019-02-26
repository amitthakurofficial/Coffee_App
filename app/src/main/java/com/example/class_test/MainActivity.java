package com.example.class_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int count=0;
    TextView counter;

    Button plus, minus;
    Button order,reset;
    CheckBox ch1,ch2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus=findViewById(R.id.button2);
        minus=findViewById(R.id.button3);
        order=findViewById(R.id.button4);
        reset=findViewById(R.id.button7);
        ch1=findViewById(R.id.checkBox);
        ch2=findViewById(R.id.checkBox2);

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
                int total=count*10;
                if(count<1)
                {
                    Toast.makeText(MainActivity.this,"order please!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    if (ch1.isChecked())
                    {
                        total=total+ (count*5);
                    }
                    if (ch2.isChecked())
                    {
                        total=total+ (count*5);
                    }

                    Toast.makeText(MainActivity.this,"your bill is "+String.valueOf(total),Toast.LENGTH_SHORT).show();
                }


            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter.setText("0");
                ch1.setChecked(false);
                ch2.setChecked(false);
                count=0;

            }
        });
    }

}
