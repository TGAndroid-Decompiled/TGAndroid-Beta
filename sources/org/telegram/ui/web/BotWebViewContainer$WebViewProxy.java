package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v70;
public class BotWebViewContainer$WebViewProxy {
    public b1 f41263a;
    public final y0 f41264b;

    public BotWebViewContainer$WebViewProxy(y0 y0Var, b1 b1Var) {
        this.f41264b = y0Var;
        this.f41263a = b1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f41263a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new v70(this, str, str2, 27));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new a0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
