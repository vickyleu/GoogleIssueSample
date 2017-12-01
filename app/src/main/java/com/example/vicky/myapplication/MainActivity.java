package com.example.vicky.myapplication;

import android.app.Activity;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import static android.webkit.WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE;
import com.example.library.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            View view = findViewById(R.id.text);
            view.getBackground().setHotspot(1, 2);
            Class<Test> a = Test.class;
            RecyclerView recyclerView;
            int i = MIXED_CONTENT_COMPATIBILITY_MODE;

        }else {

        }

    }
}
