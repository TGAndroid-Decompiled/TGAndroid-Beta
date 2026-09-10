package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sx0;
public class BotWebViewContainer$WebViewProxy {
    public c1 f37845a;
    public final y0 f37846b;

    public BotWebViewContainer$WebViewProxy(y0 y0Var, c1 c1Var) {
        this.f37846b = y0Var;
        this.f37845a = c1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f37845a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new sx0(this, str, str2, 10));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new b0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
