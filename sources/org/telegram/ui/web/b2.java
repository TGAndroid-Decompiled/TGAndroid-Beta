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
import w7.x5;
public final class b2 implements Utilities.Callback {
    public final int f42014a;
    public final Timer.Task f42015b;
    public final boolean[] f42016c;
    public final Timer d;
    public final j2 f42017e;
    public final Utilities.Callback f42018f;

    public b2(Timer.Task task, boolean[] zArr, Timer timer, j2 j2Var, Utilities.Callback callback, int i10) {
        this.f42014a = i10;
        this.f42015b = task;
        this.f42016c = zArr;
        this.d = timer;
        this.f42017e = j2Var;
        this.f42018f = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42014a) {
            case 0:
                Timer.Task task = this.f42015b;
                boolean[] zArr = this.f42016c;
                Timer timer = this.d;
                j2 j2Var = this.f42017e;
                Utilities.Callback callback = this.f42018f;
                InputStream inputStream = (InputStream) obj;
                Timer.done(task);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = j2Var.f42145a;
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
                    frameLayout.addView(webView, x5.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            AndroidUtilities.runOnUIThread(new c0(zArr2, webView, frameLayout, str2, b2Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                Timer.Task task2 = this.f42015b;
                boolean[] zArr3 = this.f42016c;
                Timer timer2 = this.d;
                j2 j2Var2 = this.f42017e;
                Utilities.Callback callback2 = this.f42018f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done(task2);
                if (!zArr3[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        j2Var2.f42147c = j2Var2.i(j2Var2.f42145a, jSONObject);
                    } catch (Exception e7) {
                        Timer.log(timer2, "error: " + e7);
                        FileLog.e(e7);
                    }
                    Timer.done(start2);
                    callback2.run(j2Var2);
                    TLRPC.TL_webPage tL_webPage = j2Var2.f42147c;
                    if (tL_webPage != null) {
                        j2.f42143e.put(tL_webPage, j2Var2);
                    }
                    Timer.finish(timer2);
                    return;
                }
                return;
        }
    }
}
