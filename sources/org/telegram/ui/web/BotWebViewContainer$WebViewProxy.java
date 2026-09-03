package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n71;
public class BotWebViewContainer$WebViewProxy {
    public a1 f42420a;
    public final x0 f42421b;

    public BotWebViewContainer$WebViewProxy(x0 x0Var, a1 a1Var) {
        this.f42421b = x0Var;
        this.f42420a = a1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new n71(this, str, str2, 6));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new z(this, str, bArr, str2, str3, 3));
    }
}
