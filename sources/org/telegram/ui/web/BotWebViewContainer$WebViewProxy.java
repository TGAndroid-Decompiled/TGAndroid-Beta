package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yw0;
public class BotWebViewContainer$WebViewProxy {
    public z0 f43964a;
    public final w0 f43965b;

    public BotWebViewContainer$WebViewProxy(w0 w0Var, z0 z0Var) {
        this.f43965b = w0Var;
        this.f43964a = z0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new yw0(this, str, str2, 13));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new a0(this, str, bArr, str2, str3, 3));
    }
}
