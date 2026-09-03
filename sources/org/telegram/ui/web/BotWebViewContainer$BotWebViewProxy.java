package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.m71;
public class BotWebViewContainer$BotWebViewProxy {
    public c1 f39355a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f39355a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new m71(this, str, str2, 4));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
