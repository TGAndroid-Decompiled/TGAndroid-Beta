package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.u41;
public class BotWebViewContainer$WebViewProxy {
    public z0 f42976a;
    public final v0 f42977b;

    public BotWebViewContainer$WebViewProxy(v0 v0Var, z0 z0Var) {
        this.f42977b = v0Var;
        this.f42976a = z0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f42976a == null) {
            return;
        }
        org.telegram.messenger.i0.g3(new u41(this, str, str2, 7));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.i0.g3(new x((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
