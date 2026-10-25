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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.LaunchActivity;
public final class z1 implements Utilities.Callback {
    public final int f45466a;
    public final Timer.Task f45467b;
    public final boolean[] f45468c;
    public final Timer d;
    public final h2 e;
    public final Utilities.Callback f45469f;

    public z1(Timer.Task task, boolean[] zArr, Timer timer, h2 h2Var, Utilities.Callback callback, int i10) {
        this.f45466a = i10;
        this.f45467b = task;
        this.f45468c = zArr;
        this.d = timer;
        this.e = h2Var;
        this.f45469f = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f45466a) {
            case 0:
                Timer.Task task = this.f45467b;
                boolean[] zArr = this.f45468c;
                Timer timer = this.d;
                h2 h2Var = this.e;
                Utilities.Callback callback = this.f45469f;
                InputStream inputStream = (InputStream) obj;
                Timer.done(task);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = h2Var.f45257a;
                    final z1 z1Var = new z1(start, zArr, timer, h2Var, callback, 1);
                    if (inputStream == null) {
                        z1Var.run(null);
                        return;
                    }
                    Context context = LaunchActivity.I1;
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
                    frameLayout.addView(webView, gb1.g(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            AndroidUtilities.runOnUIThread(new b0(zArr2, webView, frameLayout, str2, z1Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                Timer.Task task2 = this.f45467b;
                boolean[] zArr3 = this.f45468c;
                Timer timer2 = this.d;
                h2 h2Var2 = this.e;
                Utilities.Callback callback2 = this.f45469f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done(task2);
                if (!zArr3[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        h2Var2.f45259c = h2Var2.i(h2Var2.f45257a, jSONObject);
                    } catch (Exception e) {
                        Timer.log(timer2, "error: " + e);
                        FileLog.e(e);
                    }
                    Timer.done(start2);
                    callback2.run(h2Var2);
                    TLRPC.TL_webPage tL_webPage = h2Var2.f45259c;
                    if (tL_webPage != null) {
                        h2.e.put(tL_webPage, h2Var2);
                    }
                    Timer.finish(timer2);
                    return;
                }
                return;
        }
    }
}
