package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.ui.Components.es0;
public class BotWebViewContainer$WebViewProxy {
    public v0 f53091a;
    public final s0 f53092b;

    public BotWebViewContainer$WebViewProxy(s0 s0Var, v0 v0Var) {
        this.f53092b = s0Var;
        this.f53091a = v0Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f53091a == null) {
            return;
        }
        org.telegram.messenger.g0.g3(new es0((Object) this, (Object) str, (Object) str2, 13));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        org.telegram.messenger.g0.g3(new x((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
