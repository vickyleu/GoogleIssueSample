package com.example.library;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.tencent.bugly.beta.Beta;

/**
 * Created by vicky on 2017.11.30.
 */

public class App extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
        Beta.installTinker();
    }
}
