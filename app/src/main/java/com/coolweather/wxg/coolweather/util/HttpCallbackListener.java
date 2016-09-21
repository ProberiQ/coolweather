package com.coolweather.wxg.coolweather.util;

/**
 * Created by WXG on 2016/9/20.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
