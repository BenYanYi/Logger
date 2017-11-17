package com.mylove.loglib;

import android.text.TextUtils;
import android.util.Log;

/**
 * @author myLove
 * @time 2017/10/31 10:43
 * @e-mail mylove.520.y@gmail.com
 * @overview
 */

class JLogUtil {
    static boolean isEmpty(String line) {
        return TextUtils.isEmpty(line) || line.equals("\n") || line.equals("\t") || TextUtils.isEmpty(line.trim());
    }

    static void printLine(String tag, boolean isTop) {
        if (isTop) {
            Log.d(tag, "╔═══════════════════════════════════════════════════════════════════════════════════════");
        } else {
            Log.d(tag, "╚═══════════════════════════════════════════════════════════════════════════════════════");
        }
    }
}
