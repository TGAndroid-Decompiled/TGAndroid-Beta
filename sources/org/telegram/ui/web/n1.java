package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b8.mf;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yg0;
public final class n1 implements u10 {
    public final int f50966a;
    public final rz f50967b;
    public final boolean[] f50968c;
    public final sz d;
    public final u1 f50969e;
    public final u10 f50970f;

    public n1(rz rzVar, boolean[] zArr, sz szVar, u1 u1Var, u10 u10Var, int i3) {
        this.f50966a = i3;
        this.f50967b = rzVar;
        this.f50968c = zArr;
        this.d = szVar;
        this.f50969e = u1Var;
        this.f50970f = u10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f50966a) {
            case 0:
                rz rzVar = this.f50967b;
                boolean[] zArr = this.f50968c;
                sz szVar = this.d;
                u1 u1Var = this.f50969e;
                u10 u10Var = this.f50970f;
                InputStream inputStream = (InputStream) obj;
                sz.a(rzVar);
                if (!zArr[0]) {
                    rz d = sz.d(szVar, "readHTML");
                    String str = u1Var.f51046a;
                    final n1 n1Var = new n1(d, zArr, szVar, u1Var, u10Var, 1);
                    if (inputStream == null) {
                        n1Var.a(null);
                        return;
                    }
                    Context context = LaunchActivity.K1;
                    if (context == null) {
                        context = org.telegram.messenger.t0.f25457b;
                    }
                    Activity W = org.telegram.messenger.g0.W(context);
                    if (W == null) {
                        n1Var.a(null);
                        return;
                    }
                    View rootView = W.findViewById(16908290).getRootView();
                    if (!(rootView instanceof ViewGroup)) {
                        n1Var.a(null);
                        return;
                    }
                    final yg0 yg0Var = new yg0(context, 16);
                    ((ViewGroup) rootView).addView(yg0Var);
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
                    webView.setWebViewClient(new p1(u1Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    yg0Var.addView(webView, mf.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            org.telegram.messenger.g0.h3(new y(zArr2, webView, yg0Var, str2, n1Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                rz rzVar2 = this.f50967b;
                boolean[] zArr3 = this.f50968c;
                sz szVar2 = this.d;
                u1 u1Var2 = this.f50969e;
                u10 u10Var2 = this.f50970f;
                JSONObject jSONObject = (JSONObject) obj;
                sz.a(rzVar2);
                if (!zArr3[0]) {
                    rz d10 = sz.d(szVar2, "parseJSON");
                    try {
                        u1Var2.f51048c = u1Var2.i(u1Var2.f51046a, jSONObject);
                    } catch (Exception e10) {
                        sz.c(szVar2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    sz.a(d10);
                    u10Var2.a(u1Var2);
                    TLRPC.TL_webPage tL_webPage = u1Var2.f51048c;
                    if (tL_webPage != null) {
                        u1.f51044e.put(tL_webPage, u1Var2);
                    }
                    sz.b(szVar2);
                    return;
                }
                return;
        }
    }
}
