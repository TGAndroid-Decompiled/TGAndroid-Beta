package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er0;
public class BotWebViewContainer$WebViewProxy {
    public d1 f41989a;
    public final z0 f41990b;

    public BotWebViewContainer$WebViewProxy(z0 z0Var, d1 d1Var) {
        this.f41990b = z0Var;
        this.f41989a = d1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f41989a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new er0(this, str, str2, 18));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new c0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
