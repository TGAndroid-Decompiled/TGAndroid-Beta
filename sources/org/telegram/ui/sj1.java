package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class sj1 {
    public final tj1 f36713a;

    public sj1(tj1 tj1Var) {
        this.f36713a = tj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new r91(23, this, str));
    }
}
