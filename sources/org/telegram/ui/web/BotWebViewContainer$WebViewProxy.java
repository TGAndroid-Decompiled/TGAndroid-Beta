package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.in0;
public class BotWebViewContainer$WebViewProxy {
    public c1 f42090a;
    public final z0 f42091b;

    public BotWebViewContainer$WebViewProxy(z0 z0Var, c1 c1Var) {
        this.f42091b = z0Var;
        this.f42090a = c1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f42090a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new in0(this, str, str2, 21));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new b0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
