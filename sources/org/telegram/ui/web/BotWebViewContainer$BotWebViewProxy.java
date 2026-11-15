package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.lv0;
public class BotWebViewContainer$BotWebViewProxy {
    public v0 f52558a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f52558a == null) {
                a8.b("webviewproxy.postEvent: no container");
            } else {
                org.telegram.messenger.g0.h3(new lv0(this, str, str2, 8));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
