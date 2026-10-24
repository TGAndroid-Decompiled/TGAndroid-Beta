package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ey0;
public class BotWebViewContainer$BotWebViewProxy {
    public b1 f43012a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f43012a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new ey0(this, str, str2, 8));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
