package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ey0;
public class BotWebViewContainer$WebViewProxy {
    public b1 f43013a;
    public final y0 f43014b;

    public BotWebViewContainer$WebViewProxy(y0 y0Var, b1 b1Var) {
        this.f43014b = y0Var;
        this.f43013a = b1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f43013a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ey0(this, str, str2, 9));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new b0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
