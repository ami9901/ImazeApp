package com.imaze2k18.imazeapp.logging;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by ranjit on 24-05-2017.
 */

public class L {
    public static void m(String message) {
        Log.d("RESULT>>", "" + message);
    }

    public static void t(Context context, String message) {
        Toast.makeText(context, message + "", Toast.LENGTH_SHORT).show();
    }
    public static void T(Context context, String message) {
        Toast.makeText(context, message + "", Toast.LENGTH_LONG).show();
    }


}
