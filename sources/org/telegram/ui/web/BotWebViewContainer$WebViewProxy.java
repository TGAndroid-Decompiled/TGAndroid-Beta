package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.as0;
public class BotWebViewContainer$WebViewProxy {
    public v0 f53319a;
    public final s0 f53320b;

    public BotWebViewContainer$WebViewProxy(s0 s0Var, v0 v0Var) {
        this.f53320b = s0Var;
        this.f53319a = v0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f53319a == null) {
            return;
        }
        org.telegram.messenger.g0.g3(new as0(this, str, str2, 14));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.g0.g3(new x((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
