package com.example.vivek.cricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView total,one,two,fours,sixes,extras;
    private Button single,doubles,four,six,wide,no_ball;
    private int gettot=0,s=0,d=0,f=0,si=0,e=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total=findViewById(R.id.res);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        fours=findViewById(R.id.fours);
        sixes=findViewById(R.id.sixes);
        extras=findViewById(R.id.extras);
        single=findViewById(R.id.single_button);
        doubles=findViewById(R.id.double_button);
        four=findViewById(R.id.four_button);
        six=findViewById(R.id.six_button);
        wide=findViewById(R.id.wide_checkbox);
        no_ball=findViewById(R.id.no_ball_checkbox);

        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+1;
                s=s+1;
                total.setText(gettot+" ");
                one.setText(s+" ");
            }
        });

        doubles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+2;
                d=d+1;
                total.setText(gettot+" ");
                two.setText(d+" ");
            }
        });



        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+4;
                f=f+1;
                total.setText(gettot+" ");
                fours.setText(f+" ");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+6;
                si=si+1;
                total.setText(gettot+" ");
                sixes.setText(si+" ");
            }
        });

        wide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+1;
                e=e+1;
                total.setText(gettot+" ");
                extras.setText(e+" ");
            }
        });

        no_ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettot=gettot+1;
                e=e+1;
                total.setText(gettot+" ");
                extras.setText(e+" ");
            }
        });


    }
}
