package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.gs0;

public class BotWebViewContainer$BotWebViewProxy {

    public z0 f43764a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f43764a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new gs0(this, str, str2, 17));
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
