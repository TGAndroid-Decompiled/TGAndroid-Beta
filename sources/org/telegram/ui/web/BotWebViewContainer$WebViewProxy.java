package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.s31;
public class BotWebViewContainer$WebViewProxy {
    public x0 f51060a;
    public final u0 f51061b;

    public BotWebViewContainer$WebViewProxy(u0 u0Var, x0 x0Var) {
        this.f51061b = u0Var;
        this.f51060a = x0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f51060a == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new s31(this, str, str2, 7));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.g0.h3(new x((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
