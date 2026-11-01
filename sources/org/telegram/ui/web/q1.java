package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.InputStream;
import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.messenger.l00;
import org.telegram.messenger.m00;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bg0;
import w7.b6;
public final class q1 implements r20 {
    public final int f42974a;
    public final l00 f42975b;
    public final boolean[] f42976c;
    public final m00 d;
    public final y1 e;
    public final r20 f42977f;

    public q1(l00 l00Var, boolean[] zArr, m00 m00Var, y1 y1Var, r20 r20Var, int i10) {
        this.f42974a = i10;
        this.f42975b = l00Var;
        this.f42976c = zArr;
        this.d = m00Var;
        this.e = y1Var;
        this.f42977f = r20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42974a) {
            case 0:
                l00 l00Var = this.f42975b;
                boolean[] zArr = this.f42976c;
                m00 m00Var = this.d;
                y1 y1Var = this.e;
                r20 r20Var = this.f42977f;
                InputStream inputStream = (InputStream) obj;
                m00.a(l00Var);
                if (!zArr[0]) {
                    l00 d = m00.d(m00Var, "readHTML");
                    String str = y1Var.f43053a;
                    final q1 q1Var = new q1(d, zArr, m00Var, y1Var, r20Var, 1);
                    if (inputStream == null) {
                        q1Var.a(null);
                        return;
                    }
                    Context context = LaunchActivity.I1;
                    if (context == null) {
                        context = org.telegram.messenger.w0.f18945b;
                    }
                    Activity W = org.telegram.messenger.i0.W(context);
                    if (W == null) {
                        q1Var.a(null);
                        return;
                    }
                    View rootView = W.findViewById(16908290).getRootView();
                    if (!(rootView instanceof ViewGroup)) {
                        q1Var.a(null);
                        return;
                    }
                    final bg0 bg0Var = new bg0(context, 17);
                    ((ViewGroup) rootView).addView(bg0Var);
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
                    webView.setWebViewClient(new s1(y1Var, inputStream));
                    webView.setWebChromeClient(new WebChromeClient());
                    bg0Var.addView(webView, b6.c(-1.0f, -1));
                    final boolean[] zArr2 = {false};
                    webView.addJavascriptInterface(new Object() {
                        @JavascriptInterface
                        public void done(String str2) {
                            org.telegram.messenger.i0.g3(new x(zArr2, webView, bg0Var, str2, q1Var, 6));
                        }
                    }, "Instant");
                    webView.loadUrl(str);
                    return;
                }
                return;
            default:
                l00 l00Var2 = this.f42975b;
                boolean[] zArr3 = this.f42976c;
                m00 m00Var2 = this.d;
                y1 y1Var2 = this.e;
                r20 r20Var2 = this.f42977f;
                JSONObject jSONObject = (JSONObject) obj;
                m00.a(l00Var2);
                if (!zArr3[0]) {
                    l00 d10 = m00.d(m00Var2, "parseJSON");
                    try {
                        y1Var2.f43055c = y1Var2.i(y1Var2.f43053a, jSONObject);
                    } catch (Exception e) {
                        m00.c(m00Var2, "error: " + e);
                        f8.g(e, true);
                    }
                    m00.a(d10);
                    r20Var2.a(y1Var2);
                    TLRPC.TL_webPage tL_webPage = y1Var2.f43055c;
                    if (tL_webPage != null) {
                        y1.e.put(tL_webPage, y1Var2);
                    }
                    m00.b(m00Var2);
                    return;
                }
                return;
        }
    }
}
