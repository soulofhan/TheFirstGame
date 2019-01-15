package com.undeddo.thefirstgame.viewInterface;

public interface MainView {
    void setTv_user_name(String user_name);     //更新用户名
    void setTv_user_id(String user_Id);         //更新用户ID
    void setTv_diamond(String diamond);         //更新钻石数量
    void setTv_gold(String gold);               //更新金币数量
    void setTv_ticket(String ticket);           //更新奖券数量
    void setTv_email_number(String number);     //更新邮件数量
    void setBtn_user_ic(int user_ic);           //更新用户头像
}
