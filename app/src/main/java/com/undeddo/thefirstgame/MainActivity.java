package com.undeddo.thefirstgame;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.undeddo.thefirstgame.unit.Tools;
import com.undeddo.thefirstgame.viewInterface.MainView;

public class MainActivity extends Activity implements MainView {
    private static final String TAG = "MainActivity";

    private TextView tv_user_name;      //用户名
    private TextView tv_user_ID;        //用户ID
    private TextView tv_diamond;        //钻石
    private TextView tv_gold;           //金币
    private TextView tv_ticket;         //奖券
    private TextView tv_email_number;   //邮件数量

    private Button btn_user_ic;         //用户头像
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
        btn_user_ic.setOnClickListener(null);
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
        public boolean onTouch(View view, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Tools.action_down(view);
                if (view.getId() == R.id.btn_email) {
                    Tools.setX_down(tv_email_number);
                }
            }
            if (event.getAction() == MotionEvent.ACTION_UP) {
                Tools.action_up(view);
                if (view.getId() == R.id.btn_email) {
                    Tools.setX_up(tv_email_number);
                }
                view.performClick();
            }
            return false;
        }
    };

    @Override
    public void setTv_user_name(String user_name) {
        tv_user_name.setText(user_name);
    }

    @Override
    public void setTv_user_id(String user_Id) {
        tv_user_ID.setText(user_Id);
    }

    @Override
    public void setTv_diamond(String diamond) {
        tv_diamond.setText(diamond);
    }

    @Override
    public void setTv_gold(String gold) {
        tv_gold.setText(gold);
    }

    @Override
    public void setTv_ticket(String ticket) {
        tv_ticket.setText(ticket);
    }

    @Override
    public void setTv_email_number(String number) {
        tv_email_number.setText(number);
    }

    @Override
    public void setBtn_user_ic(int user_ic) {
        btn_user_ic.setBottom(user_ic);
    }
}
