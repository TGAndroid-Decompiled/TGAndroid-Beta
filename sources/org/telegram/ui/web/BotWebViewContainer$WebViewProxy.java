package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.en0;
public class BotWebViewContainer$WebViewProxy {
    public c1 f38928a;
    public final z0 f38929b;

    public BotWebViewContainer$WebViewProxy(z0 z0Var, c1 c1Var) {
        this.f38929b = z0Var;
        this.f38928a = c1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if (this.f38928a == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new en0(this, str, str2, 21));
    }

    @JavascriptInterface
    public void resolveShare(String str, byte[] bArr, String str2, String str3) {
        AndroidUtilities.runOnUIThread(new a0((Object) this, str, (Serializable) bArr, str2, str3, 5));
    }
}
