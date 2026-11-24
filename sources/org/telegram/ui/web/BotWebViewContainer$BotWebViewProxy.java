package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
public class BotWebViewContainer$BotWebViewProxy {
    public qw0 a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.a == null) {
                fc4.b("webviewproxy.postEvent: no container");
            } else {
                gm.c3(new tv0(this, str, str2, (byte) 0));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
