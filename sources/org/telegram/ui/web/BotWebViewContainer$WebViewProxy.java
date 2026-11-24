package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
public class BotWebViewContainer$WebViewProxy {
    public qw0 a;
    public final mw0 b;

    public BotWebViewContainer$WebViewProxy(mw0 mw0Var, qw0 qw0Var) {
        this.b = mw0Var;
        this.a = qw0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.a == null) {
            return;
        }
        gm.c3(new tv0(this, str, str2, (byte) 1));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        gm.c3(new da7(this, str, bArr, str2, str3, (byte) 10));
    }
}
