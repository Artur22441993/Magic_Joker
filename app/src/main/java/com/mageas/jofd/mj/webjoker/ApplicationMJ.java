package com.mageas.jofd.mj.webjoker;

import android.app.Application;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mageas.jofd.mj.webjoker.constds.Consewe;
import com.mageas.jofd.mj.webjoker.par.Parssss;
import com.onesignal.OneSignal;

import java.util.Map;

public class ApplicationMJ extends Application {

    public static String appsfdkfdf;
    public static String statusAfdlldf = "";
    public static String AIDoee;

    public static String paramspewe;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(D.dds(Consewe.oneSiewsc));

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    AIDoee = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();

                }catch (Exception e){
                }
            }
        }).start();

        appsfdkfdf = AppsFlyerLib.getInstance().getAppsFlyerUID(this);


        AppsFlyerLib.getInstance().init(D.dds(Consewe.appsFlrewcx), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                statusAfdlldf = map.get(D.dds("YWZfc3RhdHVz")).toString();
                if (statusAfdlldf.equals(D.dds("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(D.dds("Y2FtcGFpZ24=")).toString();
                    paramspewe = Parssss.par(str,getPackageName(),AIDoee,appsfdkfdf);
                }
            }

            @Override
            public void onConversionDataFail(String s) {
            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {
            }

            @Override
            public void onAttributionFailure(String s) {
            }
        }, this);
        AppsFlyerLib.getInstance().start(this);
    }
}
