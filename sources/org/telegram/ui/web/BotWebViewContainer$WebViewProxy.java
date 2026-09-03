package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m71;
public class BotWebViewContainer$WebViewProxy {
    public c1 f39356a;
    public final y0 f39357b;

    public BotWebViewContainer$WebViewProxy(y0 y0Var, c1 c1Var) {
        this.f39357b = y0Var;
        this.f39356a = c1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f39356a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new m71(this, str, str2, 5));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new b0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
