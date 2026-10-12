package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mh0;
public class BotWebViewContainer$WebViewProxy {
    public b1 f43159a;
    public final y0 f43160b;

    public BotWebViewContainer$WebViewProxy(y0 y0Var, b1 b1Var) {
        this.f43160b = y0Var;
        this.f43159a = b1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f43159a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new mh0(this, str, str2, 22));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new a0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
