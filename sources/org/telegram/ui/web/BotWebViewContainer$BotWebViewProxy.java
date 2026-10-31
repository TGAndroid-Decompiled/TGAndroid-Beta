package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.u41;
public class BotWebViewContainer$BotWebViewProxy {
    public z0 f42975a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f42975a == null) {
                f8.b("webviewproxy.postEvent: no container");
            } else {
                org.telegram.messenger.i0.g3(new u41(this, str, str2, 6));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
