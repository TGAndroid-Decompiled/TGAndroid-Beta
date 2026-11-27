package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
public class BotWebViewContainer$WebViewProxy {
    public rv0 a;
    public final nv0 b;

    public BotWebViewContainer$WebViewProxy(nv0 nv0Var, rv0 rv0Var) {
        this.b = nv0Var;
        this.a = rv0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.a == null) {
            return;
        }
        hl.c3(new tu0(this, str, str2, (byte) 1));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        hl.c3(new la7(this, str, bArr, str2, str3, (byte) 10));
    }
}
