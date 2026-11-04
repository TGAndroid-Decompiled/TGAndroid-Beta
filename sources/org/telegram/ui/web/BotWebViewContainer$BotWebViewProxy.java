package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.iv0;
public class BotWebViewContainer$BotWebViewProxy {
    public w0 f50801a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f50801a == null) {
                a8.b("webviewproxy.postEvent: no container");
            } else {
                org.telegram.messenger.g0.h3(new iv0(this, str, str2, 10));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
