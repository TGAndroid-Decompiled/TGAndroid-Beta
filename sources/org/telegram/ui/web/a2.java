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
public final class a2 implements Utilities.Callback {
    public final int f39076a;
    public final Timer.Task f39077b;
    public final boolean[] f39078c;
    public final Timer d;
    public final i2 e;
    public final Utilities.Callback f39079f;

    public a2(Timer.Task task, boolean[] zArr, Timer timer, i2 i2Var, Utilities.Callback callback, int i10) {
        this.f39076a = i10;
        this.f39077b = task;
        this.f39078c = zArr;
        this.d = timer;
        this.e = i2Var;
        this.f39079f = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39076a) {
            case 0:
                Timer.Task task = this.f39077b;
                boolean[] zArr = this.f39078c;
                Timer timer = this.d;
                i2 i2Var = this.e;
                Utilities.Callback callback = this.f39079f;
                InputStream inputStream = (InputStream) obj;
                Timer.done(task);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = i2Var.f39193a;
                    final a2 a2Var = new a2(start, zArr, timer, i2Var, callback, 1);
                    if (inputStream == null) {
                        a2Var.run(null);
                        return;
                    }
                    Context context = LaunchActivity.G1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                    Activity findActivity = AndroidUtilities.findActivity(context);
                    if (findActivity == null) {
                        a2Var.run(null);
                        return;
                    }
                    View rootView = findActivity.findViewById(16908290).getRootView();
                    if (!(rootView instanceof ViewGroup)) {
                        a2Var.run(null);
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
                    webView.setWebViewClient(new d2(i2Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    frameLayout.addView(webView, y5.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            AndroidUtilities.runOnUIThread(new a0(zArr2, webView, frameLayout, str2, a2Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                Timer.Task task2 = this.f39077b;
                boolean[] zArr3 = this.f39078c;
                Timer timer2 = this.d;
                i2 i2Var2 = this.e;
                Utilities.Callback callback2 = this.f39079f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done(task2);
                if (!zArr3[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        i2Var2.f39195c = i2Var2.i(i2Var2.f39193a, jSONObject);
                    } catch (Exception e) {
                        Timer.log(timer2, "error: " + e);
                        FileLog.e(e);
                    }
                    Timer.done(start2);
                    callback2.run(i2Var2);
                    TLRPC.TL_webPage tL_webPage = i2Var2.f39195c;
                    if (tL_webPage != null) {
                        i2.e.put(tL_webPage, i2Var2);
                    }
                    Timer.finish(timer2);
                    return;
                }
                return;
        }
    }
}
