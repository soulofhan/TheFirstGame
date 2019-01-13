package com.undeddo.thefirstgame;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.undeddo.thefirstgame.unit.Tools;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    private TextView tv_user_name;      //用户名
    private TextView tv_user_ID;        //用户ID
    private TextView tv_diamond;        //钻石
    private TextView tv_gold;           //金币
    private TextView tv_ticket;         //奖券
    private TextView tv_email_number;

    private Button btn_user_ic;       //用户头像
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

        Log.d(TAG, "onCreate:当前dpi " + getDensity() + "随意输出" + getDpi());
    }

    private void init() {
        tv_user_ID = findViewById(R.id.tv_user_ID);
        tv_diamond = findViewById(R.id.tv_diamond);
        tv_gold = findViewById(R.id.tv_gold);
        tv_ticket = findViewById(R.id.tv_ticket);
        tv_email_number = findViewById(R.id.tv_email_number);

        btn_user_ic = findViewById(R.id.btn_user_ic);
        tv_user_name = findViewById(R.id.tv_user_name);
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

    @SuppressLint("ClickableViewAccessibility")
    private void btn_click() {
        btn_user_ic.setOnTouchListener(onTouchListener);
        btn_store.setOnTouchListener(onTouchListener);
        btn_guild.setOnTouchListener(onTouchListener);
        btn_eventCenter.setOnTouchListener(onTouchListener);
        btn_gameCenter.setOnTouchListener(onTouchListener);
        btn_email.setOnTouchListener(onTouchListener);
        btn_event.setOnTouchListener(onTouchListener);
        btn_backpack.setOnTouchListener(onTouchListener);
        btn_setting.setOnTouchListener(onTouchListener);
        btn_share.setOnTouchListener(onTouchListener);
    }

    View.OnTouchListener onTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                switch (v.getId()) {
                    case R.id.btn_store:
                        Tools.action_down(btn_store);
                        break;
                    case R.id.btn_guild:
                        Tools.action_down(btn_guild);
                        break;
                    case R.id.btn_eventCenter:
                        Tools.action_down(btn_eventCenter);
                        break;
                    case R.id.btn_gameCenter:
                        Tools.action_down(btn_gameCenter);
                        break;
                    case R.id.btn_email:
                        Tools.action_down(btn_email);
                        Log.d(TAG, "onTouchDown: tv_email_number X: " + (tv_email_number.getX()) + ", tv_email_number Y: " + (tv_email_number.getY()));
                        Tools.setX_down(tv_email_number);
                        break;
                    case R.id.btn_event:
                        Tools.action_down(btn_event);
                        break;
                    case R.id.btn_backpack:
                        Tools.action_down(btn_backpack);
                        break;
                    case R.id.btn_setting:
                        Tools.action_down(btn_setting);
                        break;
                    case R.id.btn_share:
                        Tools.action_down(btn_share);
                        break;
                    default:
                        break;
                }
            }
            if (event.getAction() == MotionEvent.ACTION_UP) {
                switch (v.getId()) {
                    case R.id.btn_user_ic:
                        Log.d(TAG, "onTouchUp: 点击头像按钮");
                        break;
                    case R.id.btn_store:
                        Tools.action_up(btn_store);
                        btn_store.performClick();
                        break;
                    case R.id.btn_guild:
                        Tools.action_up(btn_guild);
                        btn_guild.performClick();
                        break;
                    case R.id.btn_eventCenter:
                        Tools.action_up(btn_eventCenter);
                        btn_eventCenter.performClick();
                        break;
                    case R.id.btn_gameCenter:
                        Tools.action_up(btn_gameCenter);
                        btn_gameCenter.performClick();
                        break;
                    case R.id.btn_email:
                        Tools.action_up(btn_email);
                        Log.d(TAG, "onTouchUp: tv_email_number X: " + (tv_email_number.getX()) + ", tv_email_number Y: " + (tv_email_number.getY()));
                        Tools.setX_up(tv_email_number);
                        btn_email.performClick();
                        break;
                    case R.id.btn_event:
                        Tools.action_up(btn_event);
                        btn_event.performClick();
                        break;
                    case R.id.btn_backpack:
                        Tools.action_up(btn_backpack);
                        btn_backpack.performClick();
                        break;
                    case R.id.btn_setting:
                        Tools.action_up(btn_setting);
                        btn_setting.performClick();
                        break;
                    case R.id.btn_share:
                        Tools.action_up(btn_share);
                        btn_share.performClick();
                        break;
                    default:
                        break;
                }
            }
            return false;
        }
    };

    private float getDensity() {
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.densityDpi;
    }

    private DisplayMetrics getDpi() {
        return getResources().getDisplayMetrics();
    }

}
