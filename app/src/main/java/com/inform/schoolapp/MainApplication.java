package com.inform.schoolapp;

import android.app.Application;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

/**
 * Created by kipkoech on 8/31/16.
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TwitterAuthConfig authConfig = new TwitterAuthConfig("298MvjuPXs8l61McUMtfOtDrO", "yys0zWmN86jALlpIVpSIfm8txYvcyEhJP6zOUatqN5FYI1BMOW");
        Fabric.with(this, new Twitter(authConfig));
    }
}
