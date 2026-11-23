package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c8.na;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gh0;
public final class o1 implements w10 {
    public final int f53501a;
    public final rz f53502b;
    public final boolean[] f53503c;
    public final sz d;
    public final w1 f53504e;
    public final w10 f53505f;

    public o1(rz rzVar, boolean[] zArr, sz szVar, w1 w1Var, w10 w10Var, int i7) {
        this.f53501a = i7;
        this.f53502b = rzVar;
        this.f53503c = zArr;
        this.d = szVar;
        this.f53504e = w1Var;
        this.f53505f = w10Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53501a) {
            case 0:
                rz rzVar = this.f53502b;
                boolean[] zArr = this.f53503c;
                sz szVar = this.d;
                w1 w1Var = this.f53504e;
                w10 w10Var = this.f53505f;
                InputStream inputStream = (InputStream) obj;
                sz.a(rzVar);
                if (!zArr[0]) {
                    rz d = sz.d(szVar, "readHTML");
                    String str = w1Var.f53623a;
                    final o1 o1Var = new o1(d, zArr, szVar, w1Var, w10Var, 1);
                    if (inputStream == null) {
                        o1Var.a(null);
                        return;
                    }
                    Context context = LaunchActivity.H1;
                    if (context == null) {
                        context = org.telegram.messenger.t0.f27013b;
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
                    final gh0 gh0Var = new gh0(context, 16);
                    ((ViewGroup) rootView).addView(gh0Var);
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
                    webView.setWebViewClient(new q1(w1Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    gh0Var.addView(webView, na.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            org.telegram.messenger.g0.g3(new x(zArr2, webView, gh0Var, str2, o1Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                rz rzVar2 = this.f53502b;
                boolean[] zArr3 = this.f53503c;
                sz szVar2 = this.d;
                w1 w1Var2 = this.f53504e;
                w10 w10Var2 = this.f53505f;
                JSONObject jSONObject = (JSONObject) obj;
                sz.a(rzVar2);
                if (!zArr3[0]) {
                    rz d2 = sz.d(szVar2, "parseJSON");
                    try {
                        w1Var2.f53625c = w1Var2.i(w1Var2.f53623a, jSONObject);
                    } catch (Exception e10) {
                        sz.c(szVar2, "error: " + e10);
                        a8.g(e10, true);
                    }
                    sz.a(d2);
                    w10Var2.a(w1Var2);
                    TLRPC.TL_webPage tL_webPage = w1Var2.f53625c;
                    if (tL_webPage != null) {
                        w1.f53621e.put(tL_webPage, w1Var2);
                    }
                    sz.b(szVar2);
                    return;
                }
                return;
        }
    }
}
