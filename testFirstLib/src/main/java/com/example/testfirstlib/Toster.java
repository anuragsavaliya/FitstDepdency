package com.example.testfirstlib;

import android.content.Context;
import android.widget.Toast;

public class Toster {

    public static void s(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();

    }
}
