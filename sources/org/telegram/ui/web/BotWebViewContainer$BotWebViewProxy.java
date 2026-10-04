package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.in0;
public class BotWebViewContainer$BotWebViewProxy {
    public c1 f42081a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f42081a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new in0(this, str, str2, 20));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
