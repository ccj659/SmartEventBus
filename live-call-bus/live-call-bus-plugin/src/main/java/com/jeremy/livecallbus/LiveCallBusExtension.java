package com.jeremy.livecallbus;

/**
 * Created by liaohailiang on 2018/8/30.
 */

public class LiveCallBusExtension {

    private boolean enable = true;

    private boolean enableLog = true;

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean getEnable() {
        return enable;
    }

    public void setEnableLog(boolean enableLog) {
        this.enableLog = enableLog;
    }

    public boolean getEnableLog() {
        return enableLog;
    }
}