package com.mageas.jofd.mj.webjoker.dev;

import android.provider.Settings;

import com.mageas.jofd.mj.webjoker.MJ;

public class Dev {

    public static int devCh(MJ mj){

        int a = Settings.Secure.getInt(mj.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
        return a;
    }
}
