package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.v41;
public class BotWebViewContainer$WebViewProxy {
    public z0 f42778a;
    public final v0 f42779b;

    public BotWebViewContainer$WebViewProxy(v0 v0Var, z0 z0Var) {
        this.f42779b = v0Var;
        this.f42778a = z0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f42778a == null) {
            return;
        }
        org.telegram.messenger.i0.g3(new v41(this, str, str2, 7));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.i0.g3(new x((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
