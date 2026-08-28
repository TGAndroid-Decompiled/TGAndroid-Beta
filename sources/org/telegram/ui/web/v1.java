package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import g7.e6;
import java.io.File;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class v1 implements Utilities.Callback {
    public final int f44047a;
    public final Object f44048b;
    public final Object f44049c;
    public final Object d;
    public final Object f44050e;
    public final Object f44051f;

    public v1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.f44047a = i9;
        this.f44048b = obj;
        this.f44049c = obj2;
        this.d = obj3;
        this.f44050e = obj4;
        this.f44051f = obj5;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44047a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f44049c;
                Timer timer = (Timer) this.d;
                d2 d2Var = (d2) this.f44050e;
                Utilities.Callback callback = (Utilities.Callback) this.f44051f;
                InputStream inputStream = (InputStream) obj;
                Timer.done((Timer.Task) this.f44048b);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = d2Var.f43837a;
                    final v1 v1Var = new v1(start, zArr, timer, d2Var, callback, 1);
                    if (inputStream == null) {
                        v1Var.run(null);
                        return;
                    }
                    Context context = LaunchActivity.C1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                    Activity findActivity = AndroidUtilities.findActivity(context);
                    if (findActivity == null) {
                        v1Var.run(null);
                        return;
                    }
                    View rootView = findActivity.findViewById(16908290).getRootView();
                    if (!(rootView instanceof ViewGroup)) {
                        v1Var.run(null);
                        return;
                    }
                    final ?? frameLayout = new FrameLayout(context);
                    ((ViewGroup) rootView).addView(frameLayout);
                    final WebView webView = new WebView(context);
                    WebSettings settings = webView.getSettings();
                    settings.setAllowContentAccess(false);
                    settings.setDatabaseEnabled(false);
                    settings.setAllowFileAccess(false);
                    settings.setJavaScriptEnabled(true);
                    settings.setSaveFormData(false);
                    settings.setGeolocationEnabled(false);
                    settings.setDomStorageEnabled(false);
                    settings.setAllowFileAccessFromFileURLs(false);
                    settings.setAllowUniversalAccessFromFileURLs(false);
                    webView.setWebViewClient(new y1(d2Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    frameLayout.addView(webView, e6.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            AndroidUtilities.runOnUIThread(new y(zArr2, webView, frameLayout, str2, v1Var));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            case 1:
                Timer timer2 = (Timer) this.d;
                d2 d2Var2 = (d2) this.f44050e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f44051f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done((Timer.Task) this.f44048b);
                if (!((boolean[]) this.f44049c)[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        d2Var2.f43839c = d2Var2.i(d2Var2.f43837a, jSONObject);
                    } catch (Exception e10) {
                        Timer.log(timer2, "error: " + e10);
                        FileLog.e(e10);
                    }
                    Timer.done(start2);
                    callback2.run(d2Var2);
                    TLRPC.TL_webPage tL_webPage = d2Var2.f43839c;
                    if (tL_webPage != null) {
                        d2.f43835e.put(tL_webPage, d2Var2);
                    }
                    Timer.finish(timer2);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new fh.k1((y0) this.f44048b, (File) obj, (org.telegram.ui.ActionBar.c2) this.f44049c, (String) this.d, (String) this.f44050e, (String) this.f44051f, 22, false));
                return;
        }
    }
}
