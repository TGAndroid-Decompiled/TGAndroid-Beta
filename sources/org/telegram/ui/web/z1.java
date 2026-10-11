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
public final class z1 implements Utilities.Callback {
    public final int f43751a;
    public final Timer.Task f43752b;
    public final boolean[] f43753c;
    public final Timer d;
    public final i2 f43754e;
    public final Utilities.Callback f43755f;

    public z1(Timer.Task task, boolean[] zArr, Timer timer, i2 i2Var, Utilities.Callback callback, int i10) {
        this.f43751a = i10;
        this.f43752b = task;
        this.f43753c = zArr;
        this.d = timer;
        this.f43754e = i2Var;
        this.f43755f = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43751a) {
            case 0:
                Timer.Task task = this.f43752b;
                boolean[] zArr = this.f43753c;
                Timer timer = this.d;
                i2 i2Var = this.f43754e;
                Utilities.Callback callback = this.f43755f;
                InputStream inputStream = (InputStream) obj;
                Timer.done(task);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = i2Var.f43542a;
                    final z1 z1Var = new z1(start, zArr, timer, i2Var, callback, 1);
                    if (inputStream == null) {
                        z1Var.run(null);
                        return;
                    }
                    Context context = LaunchActivity.G1;
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
                    webView.setWebViewClient(new c2(i2Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    frameLayout.addView(webView, x5.d(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            AndroidUtilities.runOnUIThread(new a0(zArr2, webView, frameLayout, str2, z1Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                Timer.Task task2 = this.f43752b;
                boolean[] zArr3 = this.f43753c;
                Timer timer2 = this.d;
                i2 i2Var2 = this.f43754e;
                Utilities.Callback callback2 = this.f43755f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done(task2);
                if (!zArr3[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        i2Var2.f43544c = i2Var2.i(i2Var2.f43542a, jSONObject);
                    } catch (Exception e7) {
                        Timer.log(timer2, "error: " + e7);
                        FileLog.e(e7);
                    }
                    Timer.done(start2);
                    callback2.run(i2Var2);
                    TLRPC.TL_webPage tL_webPage = i2Var2.f43544c;
                    if (tL_webPage != null) {
                        i2.f43540e.put(tL_webPage, i2Var2);
                    }
                    Timer.finish(timer2);
                    return;
                }
                return;
        }
    }
}
