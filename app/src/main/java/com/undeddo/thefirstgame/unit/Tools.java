package com.undeddo.thefirstgame.unit;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Tools {
    private static final String TAG = "Tools";

    public static void action_down(View view) {
        view.setScaleX((float) 1.1);
        view.setScaleY((float) 1.1);
    }

    public static void action_up(View view) {
        view.setScaleX((float) 1);
        view.setScaleY((float) 1);
    }

    public static void setX_down(TextView textView){
        textView.setX((textView.getX() + 6));
        textView.setY((textView.getY() - 6));
    }

    public static void setX_up(TextView textView){
        textView.setX((textView.getX() - 6));
        textView.setY((textView.getY() + 6));
    }

    public static String getVersion(Context context){
        PackageManager manager = context.getPackageManager();
        Log.d(TAG, "getManager: " + manager);
        PackageInfo info = null;
        String version = "";
        try {
            info = manager.getPackageInfo(context.getPackageName(), 0);
            version = info.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return version;
    }
}
