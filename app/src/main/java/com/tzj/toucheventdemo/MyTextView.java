package com.tzj.toucheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by mistake on 16-11-7.
 */

public class MyTextView extends TextView{
    public static final String TAG = "MyTextView";

    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "dispatch action down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "dispatch action move");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "dispatch action up");
                break;
        }
        return super.dispatchTouchEvent(event);
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
