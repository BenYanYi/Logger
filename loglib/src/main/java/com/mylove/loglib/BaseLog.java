package com.mylove.loglib;

import android.util.Log;

/**
 * @author myLove
 * @time 2017/10/31 10:41
 * @e-mail mylove.520.y@gmail.com
 * @overview
 */

 class BaseLog {

    private static final int MAX_LENGTH = 4000;

     static void printDefault(int type, String tag, String msg) {

        int index = 0;
        int length = msg.length();
        int countOfSub = length / MAX_LENGTH;

        if (countOfSub > 0) {
            for (int i = 0; i < countOfSub; i++) {
                String sub = msg.substring(index, index + MAX_LENGTH);
                printSub(type, tag, sub);
                index += MAX_LENGTH;
            }
            printSub(type, tag, msg.substring(index, length));
        } else {
            printSub(type, tag, msg);
        }
    }

    private static void printSub(int type, String tag, String sub) {
        switch (type) {
            case JLog.V:
                Log.v(tag, sub);
                break;
            case JLog.D:
                Log.d(tag, sub);
                break;
            case JLog.I:
                Log.i(tag, sub);
                break;
            case JLog.W:
                Log.w(tag, sub);
                break;
            case JLog.E:
                Log.e(tag, sub);
                break;
            case JLog.A:
                Log.wtf(tag, sub);
                break;
        }
    }
}
