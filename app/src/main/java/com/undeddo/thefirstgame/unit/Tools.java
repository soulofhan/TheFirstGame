package com.undeddo.thefirstgame.unit;

import android.view.View;
import android.widget.TextView;

public class Tools {
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
}
