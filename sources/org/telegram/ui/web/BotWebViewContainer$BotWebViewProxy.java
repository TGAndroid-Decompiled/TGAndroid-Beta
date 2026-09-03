package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.n71;
public class BotWebViewContainer$BotWebViewProxy {
    public a1 f42419a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f42419a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new n71(this, str, str2, 5));
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
