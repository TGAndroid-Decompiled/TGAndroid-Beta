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
public final class p1 implements c20 {
    public final int f51272a;
    public final zz f51273b;
    public final boolean[] f51274c;
    public final a00 d;
    public final w1 f51275e;
    public final c20 f51276f;

    public p1(zz zzVar, boolean[] zArr, a00 a00Var, w1 w1Var, c20 c20Var, int i7) {
        this.f51272a = i7;
        this.f51273b = zzVar;
        this.f51274c = zArr;
        this.d = a00Var;
        this.f51275e = w1Var;
        this.f51276f = c20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51272a) {
            case 0:
                zz zzVar = this.f51273b;
                boolean[] zArr = this.f51274c;
                a00 a00Var = this.d;
                w1 w1Var = this.f51275e;
                c20 c20Var = this.f51276f;
                InputStream inputStream = (InputStream) obj;
                a00.a(zzVar);
                if (!zArr[0]) {
                    zz d = a00.d(a00Var, "readHTML");
                    String str = w1Var.f51352a;
                    final p1 p1Var = new p1(d, zArr, a00Var, w1Var, c20Var, 1);
                    if (inputStream == null) {
                        p1Var.a(null);
                        return;
                    }
                    Context context = LaunchActivity.G1;
                    if (context == null) {
                        context = org.telegram.messenger.t0.f25566b;
                    }
                    Activity W = org.telegram.messenger.g0.W(context);
                    if (W == null) {
                        p1Var.a(null);
                        return;
                    }
                    View rootView = W.findViewById(16908290).getRootView();
                    if (!(rootView instanceof ViewGroup)) {
                        p1Var.a(null);
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
                    webView.setWebViewClient(new r1(w1Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    sq0Var.addView(webView, ha.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            org.telegram.messenger.g0.h3(new x(zArr2, webView, sq0Var, str2, p1Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                zz zzVar2 = this.f51273b;
                boolean[] zArr3 = this.f51274c;
                a00 a00Var2 = this.d;
                w1 w1Var2 = this.f51275e;
                c20 c20Var2 = this.f51276f;
                JSONObject jSONObject = (JSONObject) obj;
                a00.a(zzVar2);
                if (!zArr3[0]) {
                    zz d2 = a00.d(a00Var2, "parseJSON");
                    try {
                        w1Var2.f51354c = w1Var2.i(w1Var2.f51352a, jSONObject);
                    } catch (Exception e10) {
                        a00.c(a00Var2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    a00.a(d2);
                    c20Var2.a(w1Var2);
                    TLRPC.TL_webPage tL_webPage = w1Var2.f51354c;
                    if (tL_webPage != null) {
                        w1.f51350e.put(tL_webPage, w1Var2);
                    }
                    a00.b(a00Var2);
                    return;
                }
                return;
        }
    }
}
