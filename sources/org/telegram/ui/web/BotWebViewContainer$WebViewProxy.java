package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ze0;
public class BotWebViewContainer$WebViewProxy {
    public c1 f40950a;
    public final z0 f40951b;

    public BotWebViewContainer$WebViewProxy(z0 z0Var, c1 c1Var) {
        this.f40951b = z0Var;
        this.f40950a = c1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f40950a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ze0(this, str, str2, 24));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new b0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
