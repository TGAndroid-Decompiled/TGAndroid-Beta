package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.iv0;
public class BotWebViewContainer$WebViewProxy {
    public w0 f50802a;
    public final t0 f50803b;

    public BotWebViewContainer$WebViewProxy(t0 t0Var, w0 w0Var) {
        this.f50803b = t0Var;
        this.f50802a = w0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f50802a == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new iv0(this, str, str2, 11));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.g0.h3(new y((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
