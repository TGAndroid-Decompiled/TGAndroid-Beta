package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.yw0;
public class BotWebViewContainer$BotWebViewProxy {
    public z0 f43963a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f43963a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new yw0(this, str, str2, 12));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
