package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.s31;
public class BotWebViewContainer$BotWebViewProxy {
    public x0 f51059a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f51059a == null) {
                a8.b("webviewproxy.postEvent: no container");
            } else {
                org.telegram.messenger.g0.h3(new s31(this, str, str2, 6));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
