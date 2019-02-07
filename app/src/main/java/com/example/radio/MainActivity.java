package com.example.radio;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
RadioButton rb1,rb2,rb3;
Button btn1,btn2;
LinearLayout lay;
RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1= (RadioButton)findViewById(R.id.rb1);
        rb2= (RadioButton)findViewById(R.id.rb2);
        rb3= (RadioButton)findViewById(R.id.rb3);
        btn1= (Button)findViewById(R.id.btn1);
        btn2= (Button)findViewById(R.id.btn2);
        lay=(LinearLayout)findViewById(R.id.lay);
        rg= (RadioGroup)findViewById(R.id.rg);
    }


    public void clickcolor(View view) {
        if (rb1.isChecked()) lay.setBackgroundColor(Color.RED);
        if (rb2.isChecked()) lay.setBackgroundColor(Color.GREEN);
        if (rb3.isChecked()) lay.setBackgroundColor(Color.BLUE);
    }

    public void clickwhite(View view) {
        lay.setBackgroundColor(Color.WHITE);
    }
}
