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
import org.telegram.ui.hh0;
public final class o1 implements x10 {
    public final int f53268a;
    public final sz f53269b;
    public final boolean[] f53270c;
    public final tz d;
    public final v1 f53271e;
    public final x10 f53272f;

    public o1(sz szVar, boolean[] zArr, tz tzVar, v1 v1Var, x10 x10Var, int i7) {
        this.f53268a = i7;
        this.f53269b = szVar;
        this.f53270c = zArr;
        this.d = tzVar;
        this.f53271e = v1Var;
        this.f53272f = x10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53268a) {
            case 0:
                sz szVar = this.f53269b;
                boolean[] zArr = this.f53270c;
                tz tzVar = this.d;
                v1 v1Var = this.f53271e;
                x10 x10Var = this.f53272f;
                InputStream inputStream = (InputStream) obj;
                tz.a(szVar);
                if (!zArr[0]) {
                    sz d = tz.d(tzVar, "readHTML");
                    String str = v1Var.f53381a;
                    final o1 o1Var = new o1(d, zArr, tzVar, v1Var, x10Var, 1);
                    if (inputStream == null) {
                        o1Var.a(null);
                        return;
                    }
                    Context context = LaunchActivity.H1;
                    if (context == null) {
                        context = org.telegram.messenger.t0.f26915b;
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
                    final hh0 hh0Var = new hh0(context, 16);
                    ((ViewGroup) rootView).addView(hh0Var);
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
                    hh0Var.addView(webView, ma.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            org.telegram.messenger.g0.g3(new x(zArr2, webView, hh0Var, str2, o1Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                sz szVar2 = this.f53269b;
                boolean[] zArr3 = this.f53270c;
                tz tzVar2 = this.d;
                v1 v1Var2 = this.f53271e;
                x10 x10Var2 = this.f53272f;
                JSONObject jSONObject = (JSONObject) obj;
                tz.a(szVar2);
                if (!zArr3[0]) {
                    sz d2 = tz.d(tzVar2, "parseJSON");
                    try {
                        v1Var2.f53383c = v1Var2.i(v1Var2.f53381a, jSONObject);
                    } catch (Exception e10) {
                        tz.c(tzVar2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    tz.a(d2);
                    x10Var2.a(v1Var2);
                    TLRPC.TL_webPage tL_webPage = v1Var2.f53383c;
                    if (tL_webPage != null) {
                        v1.f53379e.put(tL_webPage, v1Var2);
                    }
                    tz.b(tzVar2);
                    return;
                }
                return;
        }
    }
}
