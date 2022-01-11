package com.mageas.jofd.mj.webjoker;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.mageas.jofd.mj.webjoker.constds.Consewe;
import com.mageas.jofd.mj.webjoker.start.StartG;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConeGislado {
   static String s;
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String coneGisda(MJ mj) {


                try {

                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(D.dds(Consewe.urlCondscd)).openConnection();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    s = bufferedReader.readLine();

                }catch (Exception e){
                    StartG.starGends(mj);
                }

        return s ;
    }
}
