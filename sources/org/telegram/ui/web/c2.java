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
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import w7.a6;
public final class c2 implements Utilities.Callback {
    public final int f37911a;
    public final Timer.Task f37912b;
    public final boolean[] f37913c;
    public final Timer d;
    public final k2 e;
    public final Utilities.Callback f37914f;

    public c2(Timer.Task task, boolean[] zArr, Timer timer, k2 k2Var, Utilities.Callback callback, int i10) {
        this.f37911a = i10;
        this.f37912b = task;
        this.f37913c = zArr;
        this.d = timer;
        this.e = k2Var;
        this.f37914f = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37911a) {
            case 0:
                Timer.Task task = this.f37912b;
                boolean[] zArr = this.f37913c;
                Timer timer = this.d;
                k2 k2Var = this.e;
                Utilities.Callback callback = this.f37914f;
                InputStream inputStream = (InputStream) obj;
                Timer.done(task);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = k2Var.f37994a;
                    final c2 c2Var = new c2(start, zArr, timer, k2Var, callback, 1);
                    if (inputStream == null) {
                        c2Var.run(null);
                        return;
                    }
                    Context context = LaunchActivity.G1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                    Activity findActivity = AndroidUtilities.findActivity(context);
                    if (findActivity == null) {
                        c2Var.run(null);
                        return;
                    }
                    View rootView = findActivity.findViewById(16908290).getRootView();
                    if (!(rootView instanceof ViewGroup)) {
                        c2Var.run(null);
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
                    webView.setWebViewClient(new f2(k2Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    frameLayout.addView(webView, a6.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            AndroidUtilities.runOnUIThread(new b0(zArr2, webView, frameLayout, str2, c2Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                Timer.Task task2 = this.f37912b;
                boolean[] zArr3 = this.f37913c;
                Timer timer2 = this.d;
                k2 k2Var2 = this.e;
                Utilities.Callback callback2 = this.f37914f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done(task2);
                if (!zArr3[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        k2Var2.f37996c = k2Var2.i(k2Var2.f37994a, jSONObject);
                    } catch (Exception e) {
                        Timer.log(timer2, "error: " + e);
                        FileLog.e(e);
                    }
                    Timer.done(start2);
                    callback2.run(k2Var2);
                    TLRPC.TL_webPage tL_webPage = k2Var2.f37996c;
                    if (tL_webPage != null) {
                        k2.e.put(tL_webPage, k2Var2);
                    }
                    Timer.finish(timer2);
                    return;
                }
                return;
        }
    }
}
