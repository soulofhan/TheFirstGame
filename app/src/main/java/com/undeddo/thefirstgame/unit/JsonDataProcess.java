package com.undeddo.thefirstgame.unit;

import android.util.Log;

import com.undeddo.thefirstgame.viewInterface.MainView;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonDataProcess {
    private static final String TAG = "JsonDataProcess";
    private MainView mainView;

    public JsonDataProcess(MainView mainView) {
        this.mainView = mainView;
        String json = "[{user_name:新哥六六六,user_id:320151,diamond:56476,gold:1000,ticket:11461},"+
                "{user_name:新哥安排一下,user_id:521465,diamond:48465,gold:5446,ticket:345615},"+
                "{user_name:新哥最牛逼,user_id:645645,diamond:87798,gold:9768,ticket:546514}]";
        parseJson(json);
    }

    public JsonDataProcess() {
        super();
    }

    private void parseJson(String json) {
        try {
            JSONArray jsonArray = new JSONArray(json);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                Log.d(TAG, "parseJson: " + jsonObject);
//              JSONObject jsonObject = new JSONObject(json);
                mainView.setTv_user_name(jsonObject.getString("user_name"));
                mainView.setTv_user_id(jsonObject.getString("user_id"));
                mainView.setTv_diamond(jsonObject.getString("diamond"));
                mainView.setTv_gold(jsonObject.getString("gold"));
                mainView.setTv_ticket(jsonObject.getString("ticket"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
