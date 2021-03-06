package com.example.library;

import android.app.Activity;
import android.app.ActivityThread;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Method;

import static android.webkit.WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE;

/**
 * Created by vicky on 2017.11.30.
 */

public class Act extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setAdapter(null);
        int i = MIXED_CONTENT_COMPATIBILITY_MODE;


        ActivityThread.currentActivityThread();

        try {
            Class<?> activityThread = Class.forName("android.app.ActivityThread");
            Method method=activityThread.getMethod("currentActivityThread");
            method.setAccessible(true);
            method.invoke(activityThread);
        } catch (Exception e) {
            e.printStackTrace();
        }

        recycler.setOnClickListener(v -> {

        });
    }
}
