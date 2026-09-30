package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.fn0;
public class BotWebViewContainer$BotWebViewProxy {
    public b1 f39065a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f39065a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new fn0(this, str, str2, 20));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
