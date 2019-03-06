package com.mylove.logger;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mylove.loglib.JLog;

/**
 * @author myLove
 * @time 2017/11/16 19:18
 * @e-mail mylove.520.y@gmail.com
 * @overview
 */

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.text);
        tv.setText(isApkInDebug() + "");
        JLog.v("测试" + isApkInDebug());
    }

    private boolean isApkInDebug() {
        try {
            @SuppressLint("PrivateApi")
            Application application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication").invoke(null, (Object[]) null);
            ApplicationInfo info = application.getApplicationInfo();
            return (info.flags & ApplicationInfo.FLAG_DEBUGGABLE) == 0;
        } catch (Exception e) {
            JLog.e(e.getMessage());
            return true;
        }
    }
}
