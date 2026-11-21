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
import org.telegram.messenger.sz;
import org.telegram.messenger.tz;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ih0;
public final class o1 implements x10 {
    public final int f53262a;
    public final sz f53263b;
    public final boolean[] f53264c;
    public final tz d;
    public final v1 f53265e;
    public final x10 f53266f;

    public o1(sz szVar, boolean[] zArr, tz tzVar, v1 v1Var, x10 x10Var, int i7) {
        this.f53262a = i7;
        this.f53263b = szVar;
        this.f53264c = zArr;
        this.d = tzVar;
        this.f53265e = v1Var;
        this.f53266f = x10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53262a) {
            case 0:
                sz szVar = this.f53263b;
                boolean[] zArr = this.f53264c;
                tz tzVar = this.d;
                v1 v1Var = this.f53265e;
                x10 x10Var = this.f53266f;
                InputStream inputStream = (InputStream) obj;
                tz.a(szVar);
                if (!zArr[0]) {
                    sz d = tz.d(tzVar, "readHTML");
                    String str = v1Var.f53375a;
                    final o1 o1Var = new o1(d, zArr, tzVar, v1Var, x10Var, 1);
                    if (inputStream == null) {
                        o1Var.a(null);
                        return;
                    }
                    Context context = LaunchActivity.H1;
                    if (context == null) {
                        context = org.telegram.messenger.t0.f26941b;
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
                sz szVar2 = this.f53263b;
                boolean[] zArr3 = this.f53264c;
                tz tzVar2 = this.d;
                v1 v1Var2 = this.f53265e;
                x10 x10Var2 = this.f53266f;
                JSONObject jSONObject = (JSONObject) obj;
                tz.a(szVar2);
                if (!zArr3[0]) {
                    sz d2 = tz.d(tzVar2, "parseJSON");
                    try {
                        v1Var2.f53377c = v1Var2.i(v1Var2.f53375a, jSONObject);
                    } catch (Exception e10) {
                        tz.c(tzVar2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    tz.a(d2);
                    x10Var2.a(v1Var2);
                    TLRPC.TL_webPage tL_webPage = v1Var2.f53377c;
                    if (tL_webPage != null) {
                        v1.f53373e.put(tL_webPage, v1Var2);
                    }
                    tz.b(tzVar2);
                    return;
                }
                return;
        }
    }
}
