package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.fr0;
public class BotWebViewContainer$BotWebViewProxy {
    public d1 f38855a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f38855a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new fr0(this, str, str2, 17));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
