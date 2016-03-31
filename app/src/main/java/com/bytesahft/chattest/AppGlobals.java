package com.bytesahft.chattest;

import android.app.Application;
import android.content.Context;

import com.quickblox.core.QBSettings;


public class AppGlobals extends Application {
    static final String APP_ID = "38323";
    static final String AUTH_KEY = "LXhRhBPa9cytrpL";
    static final String AUTH_SECRET = "haxK4wcHuuytL4r";
    static final String ACCOUNT_KEY = "MEQJD3qpqNQoTKGDA7An";
    public static Context sContext;
    public static final String USER_LOGIN_STATUS = "user_login";
    public static final String TOKEN = "token";



    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
        QBSettings.getInstance().init(getApplicationContext(), APP_ID, AUTH_KEY, AUTH_SECRET);
        QBSettings.getInstance().setAccountKey(ACCOUNT_KEY);
    }

    public static Context getContext() {
        return sContext;
    }
}
