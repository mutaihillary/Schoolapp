package com.inform.schoolapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by kipkoech on 8/25/16.
 */
public class SplashScreen extends  AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);



        Thread thr = new Thread(){


            @Override
            public void run() {
                super.run();

                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent io = new Intent(SplashScreen.this,MainActivity.class) ;
                startActivity(io);

            }
        };

        thr.start();


    }
}

