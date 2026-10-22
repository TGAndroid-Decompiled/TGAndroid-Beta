package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cy0;
public class BotWebViewContainer$WebViewProxy {
    public a1 f42554a;
    public final x0 f42555b;

    public BotWebViewContainer$WebViewProxy(x0 x0Var, a1 a1Var) {
        this.f42555b = x0Var;
        this.f42554a = a1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f42554a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new cy0(this, str, str2, 9));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new b0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
