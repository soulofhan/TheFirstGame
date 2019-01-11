package com.undeddo.thefirstgame.unit;

import android.widget.Button;

public class Tools {
    public static void action_down(Button button) {
        button.setScaleX((float) 1.1);
        button.setScaleY((float) 1.1);
    }

    public static void action_up(Button button) {
        button.setScaleX((float) 1);
        button.setScaleY((float) 1);
    }
}
