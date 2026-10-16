package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class wj1 {
    public final xj1 f41319a;

    public wj1(xj1 xj1Var) {
        this.f41319a = xj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new wg1(29, this, str));
    }
}
