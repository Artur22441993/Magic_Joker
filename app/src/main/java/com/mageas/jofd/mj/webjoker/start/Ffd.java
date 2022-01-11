package com.mageas.jofd.mj.webjoker.start;

import com.facebook.FacebookSdk;
import com.mageas.jofd.mj.webjoker.MJ;

public class Ffd {

    public static void fdfs(String f, MJ mj){

        FacebookSdk.setApplicationId(f);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(mj.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);
    }
}
