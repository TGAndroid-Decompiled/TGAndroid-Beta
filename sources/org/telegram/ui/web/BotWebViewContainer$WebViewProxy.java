package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ue0;
public class BotWebViewContainer$WebViewProxy {
    public y0 f43787a;
    public final v0 f43788b;

    public BotWebViewContainer$WebViewProxy(v0 v0Var, y0 y0Var) {
        this.f43788b = v0Var;
        this.f43787a = y0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new ue0(this, str, str2, 24));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new y(this, str, bArr, str2, str3, 3));
    }
}
