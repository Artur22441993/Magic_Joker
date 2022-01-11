package com.mageas.jofd.mj.webjoker.start;

import android.content.Intent;

import com.mageas.jofd.mj.MagJocGame;
import com.mageas.jofd.mj.webjoker.MJ;

public class StartG {

    public static void starGends(MJ mj){
        mj.startActivity(new Intent(mj.getApplicationContext(), MagJocGame.class));
        mj.finishAffinity();
    }
}
