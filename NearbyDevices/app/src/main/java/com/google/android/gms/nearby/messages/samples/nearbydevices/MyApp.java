package com.google.android.gms.nearby.messages.samples.nearbydevices;

import android.app.Application;
import android.content.Context;

/**
 * Created by arnab.saha on 9/14/2015.
 */
public class MyApp extends Application {

    private static MyApp instance;

    public MyApp() {
        instance = this;
    }

    public static Context getContext() {
        return instance;
    }
}
