package com.mageas.jofd.mj.webjoker.we;

import android.content.Intent;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import com.mageas.jofd.mj.webjoker.D;
import com.mageas.jofd.mj.webjoker.MJ;
import com.mageas.jofd.mj.webjoker.start.StartG;

public class Dsdf extends WebViewClient {
    MJ mj;

    public Dsdf(MJ mj) {
        this.mj = mj;
    }

    @Override
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        if (errorResponse.getStatusCode() == 404){
            StartG.starGends(mj);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        super.onPageFinished(view, url);
        mj.getSharedPreferences(mj.getPackageName(), mj.MODE_PRIVATE).edit().putString(D.dds("c2F2ZWRVcmw="),url).apply();
    }
}
