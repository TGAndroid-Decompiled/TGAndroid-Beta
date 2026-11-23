package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c8.ma;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.tz;
import org.telegram.messenger.uz;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ih0;
public final class o1 implements y10 {
    public final int f53266a;
    public final tz f53267b;
    public final boolean[] f53268c;
    public final uz d;
    public final v1 f53269e;
    public final y10 f53270f;

    public o1(tz tzVar, boolean[] zArr, uz uzVar, v1 v1Var, y10 y10Var, int i7) {
        this.f53266a = i7;
        this.f53267b = tzVar;
        this.f53268c = zArr;
        this.d = uzVar;
        this.f53269e = v1Var;
        this.f53270f = y10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53266a) {
            case 0:
                tz tzVar = this.f53267b;
                boolean[] zArr = this.f53268c;
                uz uzVar = this.d;
                v1 v1Var = this.f53269e;
                y10 y10Var = this.f53270f;
                InputStream inputStream = (InputStream) obj;
                uz.a(tzVar);
                if (!zArr[0]) {
                    tz d = uz.d(uzVar, "readHTML");
                    String str = v1Var.f53379a;
                    final o1 o1Var = new o1(d, zArr, uzVar, v1Var, y10Var, 1);
                    if (inputStream == null) {
                        o1Var.a(null);
                        return;
                    }
                    Context context = LaunchActivity.H1;
                    if (context == null) {
                        context = org.telegram.messenger.t0.f26931b;
                    }
                    Activity W = org.telegram.messenger.g0.W(context);
                    if (W == null) {
                        o1Var.a(null);
                        return;
                    }
                    View rootView = W.findViewById(16908290).getRootView();
                    if (!(rootView instanceof ViewGroup)) {
                        o1Var.a(null);
                        return;
                    }
                    final ih0 ih0Var = new ih0(context, 16);
                    ((ViewGroup) rootView).addView(ih0Var);
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
                    webView.setWebViewClient(new q1(v1Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    ih0Var.addView(webView, ma.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            org.telegram.messenger.g0.g3(new x(zArr2, webView, ih0Var, str2, o1Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                tz tzVar2 = this.f53267b;
                boolean[] zArr3 = this.f53268c;
                uz uzVar2 = this.d;
                v1 v1Var2 = this.f53269e;
                y10 y10Var2 = this.f53270f;
                JSONObject jSONObject = (JSONObject) obj;
                uz.a(tzVar2);
                if (!zArr3[0]) {
                    tz d2 = uz.d(uzVar2, "parseJSON");
                    try {
                        v1Var2.f53381c = v1Var2.i(v1Var2.f53379a, jSONObject);
                    } catch (Exception e10) {
                        uz.c(uzVar2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    uz.a(d2);
                    y10Var2.a(v1Var2);
                    TLRPC.TL_webPage tL_webPage = v1Var2.f53381c;
                    if (tL_webPage != null) {
                        v1.f53377e.put(tL_webPage, v1Var2);
                    }
                    uz.b(uzVar2);
                    return;
                }
                return;
        }
    }
}
