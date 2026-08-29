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
import i7.f6;
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
public final class x1 implements Utilities.Callback {
    public final int f44245a;
    public final Object f44246b;
    public final Object f44247c;
    public final Object d;
    public final Object f44248e;
    public final Object f44249f;

    public x1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f44245a = i10;
        this.f44246b = obj;
        this.f44247c = obj2;
        this.d = obj3;
        this.f44248e = obj4;
        this.f44249f = obj5;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44245a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f44247c;
                Timer timer = (Timer) this.d;
                f2 f2Var = (f2) this.f44248e;
                Utilities.Callback callback = (Utilities.Callback) this.f44249f;
                InputStream inputStream = (InputStream) obj;
                Timer.done((Timer.Task) this.f44246b);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = f2Var.f44034a;
                    final x1 x1Var = new x1(start, zArr, timer, f2Var, callback, 1);
                    if (inputStream == null) {
                        x1Var.run(null);
                        return;
                    }
                    Context context = LaunchActivity.C1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                    Activity findActivity = AndroidUtilities.findActivity(context);
                    if (findActivity == null) {
                        x1Var.run(null);
                        return;
                    }
                    View rootView = findActivity.findViewById(16908290).getRootView();
                    if (!(rootView instanceof ViewGroup)) {
                        x1Var.run(null);
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
                    webView.setWebViewClient(new a2(f2Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    frameLayout.addView(webView, f6.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            AndroidUtilities.runOnUIThread(new a0(zArr2, webView, frameLayout, str2, x1Var));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            case 1:
                Timer timer2 = (Timer) this.d;
                f2 f2Var2 = (f2) this.f44248e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f44249f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done((Timer.Task) this.f44246b);
                if (!((boolean[]) this.f44247c)[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        f2Var2.f44036c = f2Var2.i(f2Var2.f44034a, jSONObject);
                    } catch (Exception e10) {
                        Timer.log(timer2, "error: " + e10);
                        FileLog.e(e10);
                    }
                    Timer.done(start2);
                    callback2.run(f2Var2);
                    TLRPC.TL_webPage tL_webPage = f2Var2.f44036c;
                    if (tL_webPage != null) {
                        f2.f44032e.put(tL_webPage, f2Var2);
                    }
                    Timer.finish(timer2);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new ih.f1((z0) this.f44246b, (File) obj, (org.telegram.ui.ActionBar.c2) this.f44247c, (String) this.d, (String) this.f44248e, (String) this.f44249f, 20, false));
                return;
        }
    }
}
