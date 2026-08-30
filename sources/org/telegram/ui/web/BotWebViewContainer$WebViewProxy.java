package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m71;
public class BotWebViewContainer$WebViewProxy {
    public a1 f39411a;
    public final w0 f39412b;

    public BotWebViewContainer$WebViewProxy(w0 w0Var, a1 a1Var) {
        this.f39412b = w0Var;
        this.f39411a = a1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new m71(this, str, str2, 6));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new z(this, str, bArr, str2, str3, 3));
    }
}
