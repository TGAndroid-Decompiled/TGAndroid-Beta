package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c8.ja;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.wz;
import org.telegram.messenger.xz;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eh0;
public final class o1 implements z10 {
    public final int f52736a;
    public final wz f52737b;
    public final boolean[] f52738c;
    public final xz d;
    public final v1 f52739e;
    public final z10 f52740f;

    public o1(wz wzVar, boolean[] zArr, xz xzVar, v1 v1Var, z10 z10Var, int i7) {
        this.f52736a = i7;
        this.f52737b = wzVar;
        this.f52738c = zArr;
        this.d = xzVar;
        this.f52739e = v1Var;
        this.f52740f = z10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f52736a) {
            case 0:
                wz wzVar = this.f52737b;
                boolean[] zArr = this.f52738c;
                xz xzVar = this.d;
                v1 v1Var = this.f52739e;
                z10 z10Var = this.f52740f;
                InputStream inputStream = (InputStream) obj;
                xz.a(wzVar);
                if (!zArr[0]) {
                    wz d = xz.d(xzVar, "readHTML");
                    String str = v1Var.f52849a;
                    final o1 o1Var = new o1(d, zArr, xzVar, v1Var, z10Var, 1);
                    if (inputStream == null) {
                        o1Var.a(null);
                        return;
                    }
                    Context context = LaunchActivity.H1;
                    if (context == null) {
                        context = org.telegram.messenger.t0.f26600b;
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
                    final eh0 eh0Var = new eh0(context, 16);
                    ((ViewGroup) rootView).addView(eh0Var);
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
                    eh0Var.addView(webView, ja.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            org.telegram.messenger.g0.h3(new x(zArr2, webView, eh0Var, str2, o1Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                wz wzVar2 = this.f52737b;
                boolean[] zArr3 = this.f52738c;
                xz xzVar2 = this.d;
                v1 v1Var2 = this.f52739e;
                z10 z10Var2 = this.f52740f;
                JSONObject jSONObject = (JSONObject) obj;
                xz.a(wzVar2);
                if (!zArr3[0]) {
                    wz d2 = xz.d(xzVar2, "parseJSON");
                    try {
                        v1Var2.f52851c = v1Var2.i(v1Var2.f52849a, jSONObject);
                    } catch (Exception e10) {
                        xz.c(xzVar2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    xz.a(d2);
                    z10Var2.a(v1Var2);
                    TLRPC.TL_webPage tL_webPage = v1Var2.f52851c;
                    if (tL_webPage != null) {
                        v1.f52847e.put(tL_webPage, v1Var2);
                    }
                    xz.b(xzVar2);
                    return;
                }
                return;
        }
    }
}
