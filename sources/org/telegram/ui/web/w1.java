package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import h7.z5;
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

public final class w1 implements Utilities.Callback {

    public final int f44034a;

    public final Object f44035b;

    public final Object f44036c;
    public final Object d;

    public final Object f44037e;

    public final Object f44038f;

    public w1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f44034a = i10;
        this.f44035b = obj;
        this.f44036c = obj2;
        this.d = obj3;
        this.f44037e = obj4;
        this.f44038f = obj5;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44034a) {
            case 0:
                Timer.Task task = (Timer.Task) this.f44035b;
                boolean[] zArr = (boolean[]) this.f44036c;
                Timer timer = (Timer) this.d;
                e2 e2Var = (e2) this.f44037e;
                Utilities.Callback callback = (Utilities.Callback) this.f44038f;
                InputStream inputStream = (InputStream) obj;
                Timer.done(task);
                if (!zArr[0]) {
                    Timer.Task taskStart = Timer.start(timer, "readHTML");
                    String str = e2Var.f43824a;
                    final w1 w1Var = new w1(taskStart, zArr, timer, e2Var, callback, 1);
                    if (inputStream != null) {
                        Context context = LaunchActivity.C1;
                        if (context == null) {
                            context = ApplicationLoader.applicationContext;
                        }
                        Activity activityFindActivity = AndroidUtilities.findActivity(context);
                        if (activityFindActivity != null) {
                            View rootView = activityFindActivity.findViewById(16908290).getRootView();
                            if (!(rootView instanceof ViewGroup)) {
                                w1Var.run(null);
                            } else {
                                final y1 y1Var = new y1(context);
                                ((ViewGroup) rootView).addView(y1Var);
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
                                webView.setWebViewClient(new z1(e2Var, inputStream));
                                webView.setWebChromeClient(new a2());
                                y1Var.addView(webView, z5.c(-1.0f, -1));
                                final boolean[] zArr2 = {false};
                                webView.addJavascriptInterface(new Object() {
                                    @JavascriptInterface
                                    public void done(String str2) {
                                        AndroidUtilities.runOnUIThread(new z(zArr2, webView, y1Var, str2, w1Var));
                                    }
                                }, "Instant");
                                webView.loadUrl(str);
                            }
                        } else {
                            w1Var.run(null);
                        }
                    } else {
                        w1Var.run(null);
                    }
                    break;
                }
                break;
            case 1:
                Timer.Task task2 = (Timer.Task) this.f44035b;
                boolean[] zArr3 = (boolean[]) this.f44036c;
                Timer timer2 = (Timer) this.d;
                e2 e2Var2 = (e2) this.f44037e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f44038f;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done(task2);
                if (!zArr3[0]) {
                    Timer.Task taskStart2 = Timer.start(timer2, "parseJSON");
                    try {
                        e2Var2.f43826c = e2Var2.i(e2Var2.f43824a, jSONObject);
                    } catch (Exception e9) {
                        Timer.log(timer2, "error: " + e9);
                        FileLog.e(e9);
                    }
                    Timer.done(taskStart2);
                    callback2.run(e2Var2);
                    TLRPC.TL_webPage tL_webPage = e2Var2.f43826c;
                    if (tL_webPage != null) {
                        e2.f43822e.put(tL_webPage, e2Var2);
                    }
                    Timer.finish(timer2);
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new gh.i1((z0) this.f44035b, (File) obj, (org.telegram.ui.ActionBar.b2) this.f44036c, (String) this.d, (String) this.f44037e, (String) this.f44038f, 20, false));
                break;
        }
    }
}
