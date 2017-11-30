package com.example.library;

import android.app.ActivityThread;
import android.os.Build;

/**
 * Created by vicky on 2017.11.30.
 */

public class Test {
    static {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){

        }else {

        }
        ActivityThread.currentActivityThread();
    }
}
