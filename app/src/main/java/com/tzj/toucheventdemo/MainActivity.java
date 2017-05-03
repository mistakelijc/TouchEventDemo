package com.tzj.toucheventdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s1;
        String s2 = null;
        System.out.println(s1 + s2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "on touch action down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "on touch action move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "on touch action up");
                break;
        }
        return super.onTouchEvent(event);
    }
}
