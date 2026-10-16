package org.telegram.ui.web;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ze0;
public class BotWebViewContainer$BotWebViewProxy {
    public c1 f40949a;

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        try {
            if (this.f40949a == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new ze0(this, str, str2, 23));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
