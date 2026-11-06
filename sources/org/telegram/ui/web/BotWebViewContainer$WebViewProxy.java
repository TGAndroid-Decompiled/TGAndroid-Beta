package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.q31;
public class BotWebViewContainer$WebViewProxy {
    public x0 f51073a;
    public final u0 f51074b;

    public BotWebViewContainer$WebViewProxy(u0 u0Var, x0 x0Var) {
        this.f51074b = u0Var;
        this.f51073a = x0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f51073a == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new q31(this, str, str2, 7));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.g0.h3(new x((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
