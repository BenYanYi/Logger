package com.mylove.loglib;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author myLove
 * @time 2017/10/31 10:42
 * @e-mail mylove.520.y@gmail.com
 * @overview
 */

class JsonLog {
    static void printJson(String tag, String msg, String headString) {

        String message;

        try {
            if (msg.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(msg);
                message = jsonObject.toString(JLog.JSON_INDENT);
            } else if (msg.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(msg);
                message = jsonArray.toString(JLog.JSON_INDENT);
            } else {
                message = msg;
            }
        } catch (JSONException e) {
            message = msg;
        }

        JLogUtil.printLine(tag, true);
        message = headString + JLog.LINE_SEPARATOR + message;
        String[] lines = message.split(JLog.LINE_SEPARATOR);
        for (String line : lines) {
            Log.d(tag, "║ " + line);
        }
        JLogUtil.printLine(tag, false);
    }
}
