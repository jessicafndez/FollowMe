package com.idlebeat.fome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

/**
 * Created by devel on 11/01/2018.
 */

public class FollowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.follow);

        final Chronometer myChronometer = (Chronometer)findViewById(R.id.followChrono);
        Button btnStart = (Button)findViewById(R.id.btnStart);
        Button btnStop = (Button)findViewById(R.id.btnStop);

        btnStart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                myChronometer.start();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                myChronometer.stop();
            }
        });


    }

    protected void followStart() {

    }

}
