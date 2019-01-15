package com.undeddo.thefirstgame;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.undeddo.thefirstgame.unit.Tools;

public class LoginActivity extends Activity {
    private String TAG = "LoginActivity";
    long firstPressedTime = 0;

    private Button login_phone;
    private Button login_weChat;
    private CheckBox checkBox;

    private TextView tv_user_protocol;
    private TextView tv_game_protocol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        click_touch();
    }

    private void init() {
        login_phone = findViewById(R.id.phoneLogin);
        login_weChat = findViewById(R.id.weChatLogin);
        checkBox = findViewById(R.id.checkBox);
        tv_user_protocol = findViewById(R.id.tv_user_protocol);
        tv_game_protocol = findViewById(R.id.tv_game_protocol);
        ((TextView) findViewById(R.id.tv_Version)).setText(String.format("V %s", Tools.getVersion(this)));
    }

    @SuppressLint("ClickableViewAccessibility")
    private void click_touch() {
        login_phone.setOnTouchListener(onTouchListener);
        login_weChat.setOnTouchListener(onTouchListener);
        tv_user_protocol.setOnClickListener(onClickListener);
        tv_game_protocol.setOnClickListener(onClickListener);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkBox.setBackground(getDrawable(R.drawable.login_cb_true));
                } else {
                    checkBox.setBackground(getDrawable(R.drawable.login_cb_bg));
                }
            }
        });
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tv_user_protocol:
                    Toast.makeText(LoginActivity.this, "用户协议", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.tv_game_protocol:
                    Toast.makeText(LoginActivity.this, "游戏协议", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }
        }
    };

    private boolean checkboxStatus() {
        return checkBox.isChecked();
    }

    View.OnTouchListener onTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Tools.action_down(view);
            }
            if (event.getAction() == MotionEvent.ACTION_UP) {
                Tools.action_up(view);
                view.performClick();
                if (view.getId() == R.id.phoneLogin && checkboxStatus()) {
                    Toast.makeText(LoginActivity.this, "手机登录", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else if (view.getId() == R.id.weChatLogin && checkboxStatus()) {
                    Toast.makeText(LoginActivity.this, "微信登录", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginActivity.this, "请阅读并同意用户协议", Toast.LENGTH_SHORT).show();
                }
            }
            return false;
        }
    };

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - firstPressedTime < 2000) {
            super.onBackPressed();
        } else {
            Toast.makeText(LoginActivity.this, getResources().getString(R.string.login_again), Toast.LENGTH_SHORT).show();
            firstPressedTime = System.currentTimeMillis();
        }
    }
}
