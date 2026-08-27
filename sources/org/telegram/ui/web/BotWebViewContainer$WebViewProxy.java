package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gs0;

public class BotWebViewContainer$WebViewProxy {

    public z0 f43765a;

    public final w0 f43766b;

    public BotWebViewContainer$WebViewProxy(w0 w0Var, z0 z0Var) {
        this.f43766b = w0Var;
        this.f43765a = z0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new gs0(this, str, str2, 18));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new z(this, str, bArr, str2, str3, 3));
    }
}
