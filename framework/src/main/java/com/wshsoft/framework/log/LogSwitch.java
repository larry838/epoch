package com.wshsoft.framework.log;

public class LogSwitch {
    
    /** 是否显示Log日志 */
    public static boolean showLog = true;

    public static boolean isShowLog() {
        return showLog;
    }

    public static void setShowLog(boolean showLog) {
        LogSwitch.showLog = showLog;
    }
    

}
