package com.mylove.logger;

import android.app.Application;

/**
 * @author myLove
 * @time 2017/11/16 19:11
 * @e-mail mylove.520.y@gmail.com
 * @overview
 */

public class AppContext extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        JLog.init(BuildConfig.LOG_DEBUG);
//        JLog.init(true);
    }
}
