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
import w7.y5;
public final class b2 implements Utilities.Callback {
    public final int f38836a;
    public final Timer.Task f38837b;
    public final boolean[] f38838c;
    public final Timer d;
    public final j2 e;
    public final Utilities.Callback f38839f;

    public b2(Timer.Task task, boolean[] zArr, Timer timer, j2 j2Var, Utilities.Callback callback, int i10) {
        this.f38836a = i10;
        this.f38837b = task;
        this.f38838c = zArr;
        this.d = timer;
        this.e = j2Var;
        this.f38839f = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38836a) {
            case 0:
                Timer.Task task = this.f38837b;
                boolean[] zArr = this.f38838c;
                Timer timer = this.d;
                j2 j2Var = this.e;
                Utilities.Callback callback = this.f38839f;
                InputStream inputStream = (InputStream) obj;
                Timer.done(task);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = j2Var.f38953a;
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
                    frameLayout.addView(webView, y5.c(-1.0f, -1));
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
                Timer.Task task2 = this.f38837b;
                boolean[] zArr3 = this.f38838c;
                Timer timer2 = this.d;
                j2 j2Var2 = this.e;
                Utilities.Callback callback2 = this.f38839f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done(task2);
                if (!zArr3[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        j2Var2.f38955c = j2Var2.i(j2Var2.f38953a, jSONObject);
                    } catch (Exception e) {
                        Timer.log(timer2, "error: " + e);
                        FileLog.e(e);
                    }
                    Timer.done(start2);
                    callback2.run(j2Var2);
                    TLRPC.TL_webPage tL_webPage = j2Var2.f38955c;
                    if (tL_webPage != null) {
                        j2.e.put(tL_webPage, j2Var2);
                    }
                    Timer.finish(timer2);
                    return;
                }
                return;
        }
    }
}
