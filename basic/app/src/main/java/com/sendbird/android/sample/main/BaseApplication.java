package com.sendbird.android.sample.main;


import android.app.Application;

import com.sendbird.android.SendBird;
import com.sendbird.android.sample.fcm.MyFirebaseMessagingService;
import com.sendbird.android.sample.utils.PreferenceUtils;
import com.sendbird.android.sample.utils.PushUtils;

public class BaseApplication extends Application {

    private static final String APP_ID = "717ED4E2-220B-4ADF-BFC8-044283AA1058"; // US-1 Demo
    public static final String VERSION = "3.0.40";

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceUtils.init(getApplicationContext());

        SendBird.init(APP_ID, getApplicationContext());

        PushUtils.registerPushHandler(new MyFirebaseMessagingService());
    }
}
