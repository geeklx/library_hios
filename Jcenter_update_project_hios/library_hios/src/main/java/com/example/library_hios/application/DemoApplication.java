package com.example.library_hios.application;

import android.app.Application;
import android.content.Context;

import com.example.library_hios.hioscommon.HiosRegister;

public class DemoApplication extends Application {
    private static final String TAG = "DemoApplication";
    private static DemoApplication sInstance = null;
    public static Context mContext;

    public static DemoApplication get() {
        if (sInstance == null) {
            sInstance = new DemoApplication();
        }
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        HiosRegister.load();
    }
}
