package com.mylibrary.app;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ankurrawal on 10/10/18.
 */

public class ToasterMessage {

    public static void s(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();

    }
}