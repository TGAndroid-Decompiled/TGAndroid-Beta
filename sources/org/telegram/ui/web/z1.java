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
import java.io.File;
import java.io.InputStream;
import k7.c6;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class z1 implements Utilities.Callback {
    public final int f42787a;
    public final Object f42788b;
    public final Object f42789c;
    public final Object d;
    public final Object f42790e;
    public final Object f42791f;

    public z1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f42787a = i10;
        this.f42788b = obj;
        this.f42789c = obj2;
        this.d = obj3;
        this.f42790e = obj4;
        this.f42791f = obj5;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42787a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f42789c;
                Timer timer = (Timer) this.d;
                h2 h2Var = (h2) this.f42790e;
                Utilities.Callback callback = (Utilities.Callback) this.f42791f;
                InputStream inputStream = (InputStream) obj;
                Timer.done((Timer.Task) this.f42788b);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = h2Var.f42578a;
                    final z1 z1Var = new z1(start, zArr, timer, h2Var, callback, 1);
                    if (inputStream == null) {
                        z1Var.run(null);
                        return;
                    }
                    Context context = LaunchActivity.D1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                    Activity findActivity = AndroidUtilities.findActivity(context);
                    if (findActivity == null) {
                        z1Var.run(null);
                        return;
                    }
                    View rootView = findActivity.findViewById(16908290).getRootView();
                    if (!(rootView instanceof ViewGroup)) {
                        z1Var.run(null);
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
                    webView.setWebViewClient(new c2(h2Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    frameLayout.addView(webView, c6.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            AndroidUtilities.runOnUIThread(new z(zArr2, webView, frameLayout, str2, z1Var));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            case 1:
                Timer timer2 = (Timer) this.d;
                h2 h2Var2 = (h2) this.f42790e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f42791f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done((Timer.Task) this.f42788b);
                if (!((boolean[]) this.f42789c)[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        h2Var2.f42580c = h2Var2.i(h2Var2.f42578a, jSONObject);
                    } catch (Exception e6) {
                        Timer.log(timer2, "error: " + e6);
                        FileLog.e(e6);
                    }
                    Timer.done(start2);
                    callback2.run(h2Var2);
                    TLRPC.TL_webPage tL_webPage = h2Var2.f42580c;
                    if (tL_webPage != null) {
                        h2.f42576e.put(tL_webPage, h2Var2);
                    }
                    Timer.finish(timer2);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new lh.e1((a1) this.f42788b, (File) obj, (org.telegram.ui.ActionBar.d2) this.f42789c, (String) this.d, (String) this.f42790e, (String) this.f42791f, 19, false));
                return;
        }
    }
}
