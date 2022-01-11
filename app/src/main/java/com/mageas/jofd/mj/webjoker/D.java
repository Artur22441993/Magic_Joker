package com.mageas.jofd.mj.webjoker;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Base64;

public class D {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String dds(String sss){
        Base64.Decoder dec = Base64.getDecoder();
        String decoded = new String(dec.decode(sss));
        return decoded;
    }
}
