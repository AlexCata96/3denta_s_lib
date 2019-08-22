package com.wiredent.testlib;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "SUCCES";

    public static void d(String message){
        Log.d(TAG,message);
    }
}
