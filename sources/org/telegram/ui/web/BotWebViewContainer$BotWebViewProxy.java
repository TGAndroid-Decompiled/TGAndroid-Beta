package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.cy0;
public class BotWebViewContainer$BotWebViewProxy {
    public a1 f42554a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f42554a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new cy0(this, str, str2, 8));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
