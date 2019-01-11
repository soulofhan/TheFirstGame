package com.undeddo.thefirstgame;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private ImageView iv_user_ic;

    private TextView tv_user_name;
    private TextView tv_user_ID;
    private TextView tv_diamond;
    private TextView tv_gold;
    private TextView tv_ticket;

    private Button btn_store;
    private Button btn_guild;
    private Button btn_eventCenter;
    private Button btn_gameCenter;
    private Button btn_email;
    private Button btn_event;
    private Button btn_backpack;
    private Button btn_setting;
    private Button btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void init(){
        iv_user_ic = findViewById(R.id.iv_user_ic);
    }
}
