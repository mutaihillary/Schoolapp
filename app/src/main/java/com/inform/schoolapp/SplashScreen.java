package com.inform.schoolapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;

/**
 * Created by kipkoech on 8/25/16.
 */
public class SplashScreen extends  AppCompatActivity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "298MvjuPXs8l61McUMtfOtDrO";
    private static final String TWITTER_SECRET = "yys0zWmN86jALlpIVpSIfm8txYvcyEhJP6zOUatqN5FYI1BMOW";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);



        Thread thr = new Thread(){


            @Override
            public void run() {


                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent io = new Intent(SplashScreen.this,LoginActivity.class) ;
                startActivity(io);

            }
        };

        thr.start();


    }
}

