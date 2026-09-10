package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.sx0;
public class BotWebViewContainer$BotWebViewProxy {
    public c1 f37844a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f37844a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new sx0(this, str, str2, 9));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
