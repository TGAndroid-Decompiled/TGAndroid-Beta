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
import k7.b6;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class y1 implements Utilities.Callback {
    public final int f39709a;
    public final Object f39710b;
    public final Object f39711c;
    public final Object d;
    public final Object e;
    public final Object f39712f;

    public y1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f39709a = i10;
        this.f39710b = obj;
        this.f39711c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f39712f = obj5;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39709a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f39711c;
                Timer timer = (Timer) this.d;
                g2 g2Var = (g2) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f39712f;
                InputStream inputStream = (InputStream) obj;
                Timer.done((Timer.Task) this.f39710b);
                if (!zArr[0]) {
                    Timer.Task start = Timer.start(timer, "readHTML");
                    String str = g2Var.f39509a;
                    final y1 y1Var = new y1(start, zArr, timer, g2Var, callback, 1);
                    if (inputStream == null) {
                        y1Var.run(null);
                        return;
                    }
                    Context context = LaunchActivity.D1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                    Activity findActivity = AndroidUtilities.findActivity(context);
                    if (findActivity == null) {
                        y1Var.run(null);
                        return;
                    }
                    View rootView = findActivity.findViewById(16908290).getRootView();
                    if (!(rootView instanceof ViewGroup)) {
                        y1Var.run(null);
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
                    webView.setWebViewClient(new b2(g2Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    frameLayout.addView(webView, b6.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            AndroidUtilities.runOnUIThread(new z(zArr2, webView, frameLayout, str2, y1Var));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            case 1:
                Timer timer2 = (Timer) this.d;
                g2 g2Var2 = (g2) this.e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f39712f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done((Timer.Task) this.f39710b);
                if (!((boolean[]) this.f39711c)[0]) {
                    Timer.Task start2 = Timer.start(timer2, "parseJSON");
                    try {
                        g2Var2.f39511c = g2Var2.i(g2Var2.f39509a, jSONObject);
                    } catch (Exception e) {
                        Timer.log(timer2, "error: " + e);
                        FileLog.e(e);
                    }
                    Timer.done(start2);
                    callback2.run(g2Var2);
                    TLRPC.TL_webPage tL_webPage = g2Var2.f39511c;
                    if (tL_webPage != null) {
                        g2.e.put(tL_webPage, g2Var2);
                    }
                    Timer.finish(timer2);
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new kh.e1((a1) this.f39710b, (File) obj, (org.telegram.ui.ActionBar.d2) this.f39711c, (String) this.d, (String) this.e, (String) this.f39712f, 19, false));
                return;
        }
    }
}
