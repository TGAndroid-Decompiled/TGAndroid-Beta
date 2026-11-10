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
import org.telegram.ui.vq0;
public final class p1 implements c20 {
    public final int f51207a;
    public final zz f51208b;
    public final boolean[] f51209c;
    public final a00 d;
    public final w1 f51210e;
    public final c20 f51211f;

    public p1(zz zzVar, boolean[] zArr, a00 a00Var, w1 w1Var, c20 c20Var, int i7) {
        this.f51207a = i7;
        this.f51208b = zzVar;
        this.f51209c = zArr;
        this.d = a00Var;
        this.f51210e = w1Var;
        this.f51211f = c20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51207a) {
            case 0:
                zz zzVar = this.f51208b;
                boolean[] zArr = this.f51209c;
                a00 a00Var = this.d;
                w1 w1Var = this.f51210e;
                c20 c20Var = this.f51211f;
                InputStream inputStream = (InputStream) obj;
                a00.a(zzVar);
                if (!zArr[0]) {
                    zz d = a00.d(a00Var, "readHTML");
                    String str = w1Var.f51287a;
                    final p1 p1Var = new p1(d, zArr, a00Var, w1Var, c20Var, 1);
                    if (inputStream == null) {
                        p1Var.a(null);
                        return;
                    }
                    Context context = LaunchActivity.G1;
                    if (context == null) {
                        context = org.telegram.messenger.t0.f25570b;
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
                    final vq0 vq0Var = new vq0(context, 14);
                    ((ViewGroup) rootView).addView(vq0Var);
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
                    vq0Var.addView(webView, ha.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            org.telegram.messenger.g0.h3(new x(zArr2, webView, vq0Var, str2, p1Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                zz zzVar2 = this.f51208b;
                boolean[] zArr3 = this.f51209c;
                a00 a00Var2 = this.d;
                w1 w1Var2 = this.f51210e;
                c20 c20Var2 = this.f51211f;
                JSONObject jSONObject = (JSONObject) obj;
                a00.a(zzVar2);
                if (!zArr3[0]) {
                    zz d2 = a00.d(a00Var2, "parseJSON");
                    try {
                        w1Var2.f51289c = w1Var2.i(w1Var2.f51287a, jSONObject);
                    } catch (Exception e10) {
                        a00.c(a00Var2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    a00.a(d2);
                    c20Var2.a(w1Var2);
                    TLRPC.TL_webPage tL_webPage = w1Var2.f51289c;
                    if (tL_webPage != null) {
                        w1.f51285e.put(tL_webPage, w1Var2);
                    }
                    a00.b(a00Var2);
                    return;
                }
                return;
        }
    }
}
