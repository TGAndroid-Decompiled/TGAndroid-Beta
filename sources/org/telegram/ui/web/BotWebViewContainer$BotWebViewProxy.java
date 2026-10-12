package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.v70;
public class BotWebViewContainer$BotWebViewProxy {
    public b1 f41262a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f41262a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new v70(this, str, str2, 26));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
