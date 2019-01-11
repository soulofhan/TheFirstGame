package com.undeddo.thefirstgame;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.undeddo.thefirstgame.unit.Tools;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    private ImageView iv_user_ic;       //用户头像

    private TextView tv_user_name;      //用户名
    private TextView tv_user_ID;        //用户ID
    private TextView tv_diamond;        //钻石
    private TextView tv_gold;           //金币
    private TextView tv_ticket;         //奖券

    private Button btn_store;           //商店
    private Button btn_guild;           //公会
    private Button btn_eventCenter;     //赛事中心
    private Button btn_gameCenter;      //游戏中心
    private Button btn_email;           //邮件
    private Button btn_event;           //活动
    private Button btn_backpack;        //背包
    private Button btn_setting;         //设置
    private Button btn_share;           //分享

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btn_click();
    }

    private void init() {
        iv_user_ic = findViewById(R.id.iv_user_ic);

        tv_user_name = findViewById(R.id.tv_user_name);
        tv_user_ID = findViewById(R.id.tv_user_ID);
        tv_diamond = findViewById(R.id.tv_diamond);
        tv_gold = findViewById(R.id.tv_gold);
        tv_ticket = findViewById(R.id.tv_ticket);

        btn_store = findViewById(R.id.btn_store);
        btn_guild = findViewById(R.id.btn_guild);
        btn_eventCenter = findViewById(R.id.btn_eventCenter);
        btn_gameCenter = findViewById(R.id.btn_gameCenter);
        btn_email = findViewById(R.id.btn_email);
        btn_event = findViewById(R.id.btn_event);
        btn_backpack = findViewById(R.id.btn_backpack);
        btn_setting = findViewById(R.id.btn_setting);
        btn_share = findViewById(R.id.btn_share);
    }

    private void btn_click() {
        btn_store.setOnTouchListener(onTouchListener);
    }

    View.OnTouchListener onTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Log.d(TAG, "onTouch: " + event.getAction());
                Log.d(TAG, "ViewID" + v.getId() + "btnID" + R.id.btn_store);
                switch (v.getId()) {
                    case R.id.btn_store:
                        Tools.action_down(btn_store);
                        break;
                    default:
                        break;
                }
            }
            if (event.getAction() == MotionEvent.ACTION_UP) {
                Log.d(TAG, "onTouch: " + event.getAction());
                switch (v.getId()) {
                    case R.id.btn_store:
                        Tools.action_up(btn_store);
                        break;
                    default:
                        break;
                }
            }
            return false;
        }
    };
}
