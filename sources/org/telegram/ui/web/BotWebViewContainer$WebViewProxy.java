package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.og0;
public class BotWebViewContainer$WebViewProxy {
    public b1 f43212a;
    public final y0 f43213b;

    public BotWebViewContainer$WebViewProxy(y0 y0Var, b1 b1Var) {
        this.f43213b = y0Var;
        this.f43212a = b1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f43212a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new og0(this, str, str2, 23));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new a0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
