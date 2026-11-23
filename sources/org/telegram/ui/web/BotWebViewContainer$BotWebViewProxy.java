package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.es0;
public class BotWebViewContainer$BotWebViewProxy {
    public v0 f53090a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f53090a == null) {
                a8.b("webviewproxy.postEvent: no container");
            } else {
                org.telegram.messenger.g0.g3(new es0((Object) this, (Object) str, (Object) str2, 12));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
