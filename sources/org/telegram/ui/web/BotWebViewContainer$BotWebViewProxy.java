package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.sv0;
public class BotWebViewContainer$BotWebViewProxy {
    public v0 f53092a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f53092a == null) {
                a8.b("webviewproxy.postEvent: no container");
            } else {
                org.telegram.messenger.g0.g3(new sv0((Object) this, (Object) str, (Object) str2, 11));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
