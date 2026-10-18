package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ay0;
public class BotWebViewContainer$WebViewProxy {
    public b1 f42501a;
    public final y0 f42502b;

    public BotWebViewContainer$WebViewProxy(y0 y0Var, b1 b1Var) {
        this.f42502b = y0Var;
        this.f42501a = b1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f42501a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ay0(this, str, str2, 9));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new c0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
