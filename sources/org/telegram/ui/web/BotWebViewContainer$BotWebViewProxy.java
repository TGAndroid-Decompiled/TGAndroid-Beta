package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.og0;
public class BotWebViewContainer$BotWebViewProxy {
    public b1 f43211a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f43211a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new og0(this, str, str2, 22));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
