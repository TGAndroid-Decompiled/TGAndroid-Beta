package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
public class BotWebViewContainer$BotWebViewProxy {
    public hv0 a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.a == null) {
                fa4.b("webviewproxy.postEvent: no container");
            } else {
                gl.c3(new nn6(this, str, str2, (byte) 29));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
