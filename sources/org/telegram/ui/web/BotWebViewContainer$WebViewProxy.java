package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
public class BotWebViewContainer$WebViewProxy {
    public hv0 a;
    public final cv0 b;

    public BotWebViewContainer$WebViewProxy(cv0 cv0Var, hv0 hv0Var) {
        this.b = cv0Var;
        this.a = hv0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.a == null) {
            return;
        }
        gl.c3(new fv0(this, str, str2, (byte) 0));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        gl.c3(new b87(this, str, bArr, str2, str3, (byte) 10));
    }
}
