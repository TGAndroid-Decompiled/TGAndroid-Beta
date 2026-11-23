package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.as0;
public class BotWebViewContainer$BotWebViewProxy {
    public v0 f53318a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f53318a == null) {
                a8.b("webviewproxy.postEvent: no container");
            } else {
                org.telegram.messenger.g0.g3(new as0(this, str, str2, 13));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
