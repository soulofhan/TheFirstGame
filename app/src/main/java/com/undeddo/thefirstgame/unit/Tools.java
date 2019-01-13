package com.undeddo.thefirstgame.unit;

import android.widget.Button;
import android.widget.TextView;

public class Tools {
    public static void action_down(Button button) {
        button.setScaleX((float) 1.1);
        button.setScaleY((float) 1.1);
    }

    public static void action_up(Button button) {
        button.setScaleX((float) 1);
        button.setScaleY((float) 1);
    }

    public static void setX_down(TextView textView){
        textView.setX((textView.getX() + 6));
        textView.setY((textView.getY() - 6));
    }

    public static void setX_up(TextView textView){
        textView.setX((textView.getX() + 6));
        textView.setY((textView.getY() - 6));
    }
}
