package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.lv0;
public class BotWebViewContainer$WebViewProxy {
    public v0 f52562a;
    public final s0 f52563b;

    public BotWebViewContainer$WebViewProxy(s0 s0Var, v0 v0Var) {
        this.f52563b = s0Var;
        this.f52562a = v0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f52562a == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new lv0(this, str, str2, 9));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.g0.h3(new x((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
