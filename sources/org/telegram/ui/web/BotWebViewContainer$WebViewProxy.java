package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cn0;
public class BotWebViewContainer$WebViewProxy {
    public d1 f38811a;
    public final z0 f38812b;

    public BotWebViewContainer$WebViewProxy(z0 z0Var, d1 d1Var) {
        this.f38812b = z0Var;
        this.f38811a = d1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f38811a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new cn0(this, str, str2, 21));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new b0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
