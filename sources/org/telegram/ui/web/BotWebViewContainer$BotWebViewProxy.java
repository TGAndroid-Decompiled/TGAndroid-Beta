package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ue0;
public class BotWebViewContainer$BotWebViewProxy {
    public y0 f43786a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f43786a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new ue0(this, str, str2, 23));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
