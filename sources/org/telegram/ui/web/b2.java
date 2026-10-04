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
import w7.z5;
public final class b2 implements Utilities.Callback {
    public final int f42108a;
    public final Timer.Task f42109b;
    public final boolean[] f42110c;
    public final Timer d;
    public final j2 f42111e;
    public final Utilities.Callback f42112f;

    public b2(Timer.Task task, boolean[] zArr, Timer timer, j2 j2Var, Utilities.Callback callback, int i10) {
        this.f42108a = i10;
        this.f42109b = task;
        this.f42110c = zArr;
        this.d = timer;
        this.f42111e = j2Var;
        this.f42112f = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42108a) {
            case 0:
                Timer.Task task = this.f42109b;
                boolean[] zArr = this.f42110c;
                Timer timer = this.d;
                j2 j2Var = this.f42111e;
                Utilities.Callback callback = this.f42112f;
                InputStream inputStream = (InputStream) obj;
                Timer.done(task);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = j2Var.f42240a;
                    final b2 b2Var = new b2(start, zArr, timer, j2Var, callback, 1);
                    if (inputStream == null) {
                        b2Var.run(null);
                        return;
                    }
                    Context context = LaunchActivity.G1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                    Activity findActivity = AndroidUtilities.findActivity(context);
                    if (findActivity == null) {
                        b2Var.run(null);
                        return;
                    }
                    View rootView = findActivity.findViewById(16908290).getRootView();
                    if (!(rootView instanceof ViewGroup)) {
                        b2Var.run(null);
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
                    webView.setWebViewClient(new e2(j2Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    frameLayout.addView(webView, z5.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            AndroidUtilities.runOnUIThread(new b0(zArr2, webView, frameLayout, str2, b2Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                Timer.Task task2 = this.f42109b;
                boolean[] zArr3 = this.f42110c;
                Timer timer2 = this.d;
                j2 j2Var2 = this.f42111e;
                Utilities.Callback callback2 = this.f42112f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done(task2);
                if (!zArr3[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        j2Var2.f42242c = j2Var2.i(j2Var2.f42240a, jSONObject);
                    } catch (Exception e7) {
                        Timer.log(timer2, "error: " + e7);
                        FileLog.e(e7);
                    }
                    Timer.done(start2);
                    callback2.run(j2Var2);
                    TLRPC.TL_webPage tL_webPage = j2Var2.f42242c;
                    if (tL_webPage != null) {
                        j2.f42238e.put(tL_webPage, j2Var2);
                    }
                    Timer.finish(timer2);
                    return;
                }
                return;
        }
    }
}
