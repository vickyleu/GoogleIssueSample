package com.example.library;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

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
        recycler.setOnClickListener(v -> {

        });
    }
}
