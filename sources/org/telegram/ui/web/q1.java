package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c8.ha;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.a00;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.zz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sq0;
public final class q1 implements c20 {
    public final int f51281a;
    public final zz f51282b;
    public final boolean[] f51283c;
    public final a00 d;
    public final x1 f51284e;
    public final c20 f51285f;

    public q1(zz zzVar, boolean[] zArr, a00 a00Var, x1 x1Var, c20 c20Var, int i7) {
        this.f51281a = i7;
        this.f51282b = zzVar;
        this.f51283c = zArr;
        this.d = a00Var;
        this.f51284e = x1Var;
        this.f51285f = c20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51281a) {
            case 0:
                zz zzVar = this.f51282b;
                boolean[] zArr = this.f51283c;
                a00 a00Var = this.d;
                x1 x1Var = this.f51284e;
                c20 c20Var = this.f51285f;
                InputStream inputStream = (InputStream) obj;
                a00.a(zzVar);
                if (!zArr[0]) {
                    zz d = a00.d(a00Var, "readHTML");
                    String str = x1Var.f51396a;
                    final q1 q1Var = new q1(d, zArr, a00Var, x1Var, c20Var, 1);
                    if (inputStream == null) {
                        q1Var.a(null);
                        return;
                    }
                    Context context = LaunchActivity.G1;
                    if (context == null) {
                        context = org.telegram.messenger.t0.f25555b;
                    }
                    Activity W = org.telegram.messenger.g0.W(context);
                    if (W == null) {
                        q1Var.a(null);
                        return;
                    }
                    View rootView = W.findViewById(16908290).getRootView();
                    if (!(rootView instanceof ViewGroup)) {
                        q1Var.a(null);
                        return;
                    }
                    final sq0 sq0Var = new sq0(context, 14);
                    ((ViewGroup) rootView).addView(sq0Var);
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
                    webView.setWebViewClient(new s1(x1Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    sq0Var.addView(webView, ha.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            org.telegram.messenger.g0.h3(new x(zArr2, webView, sq0Var, str2, q1Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                zz zzVar2 = this.f51282b;
                boolean[] zArr3 = this.f51283c;
                a00 a00Var2 = this.d;
                x1 x1Var2 = this.f51284e;
                c20 c20Var2 = this.f51285f;
                JSONObject jSONObject = (JSONObject) obj;
                a00.a(zzVar2);
                if (!zArr3[0]) {
                    zz d2 = a00.d(a00Var2, "parseJSON");
                    try {
                        x1Var2.f51398c = x1Var2.i(x1Var2.f51396a, jSONObject);
                    } catch (Exception e10) {
                        a00.c(a00Var2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    a00.a(d2);
                    c20Var2.a(x1Var2);
                    TLRPC.TL_webPage tL_webPage = x1Var2.f51398c;
                    if (tL_webPage != null) {
                        x1.f51394e.put(tL_webPage, x1Var2);
                    }
                    a00.b(a00Var2);
                    return;
                }
                return;
        }
    }
}
