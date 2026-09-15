package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fr0;
public class BotWebViewContainer$WebViewProxy {
    public d1 f38856a;
    public final z0 f38857b;

    public BotWebViewContainer$WebViewProxy(z0 z0Var, d1 d1Var) {
        this.f38857b = z0Var;
        this.f38856a = d1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f38856a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fr0(this, str, str2, 18));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new b0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
