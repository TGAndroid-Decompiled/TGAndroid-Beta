package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.cn0;
public class BotWebViewContainer$BotWebViewProxy {
    public b1 f38977a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f38977a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new cn0(this, str, str2, 20));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
