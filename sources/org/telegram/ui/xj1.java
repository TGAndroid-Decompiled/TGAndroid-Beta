package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class xj1 {
    public final yj1 f41889a;

    public xj1(yj1 yj1Var) {
        this.f41889a = yj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.t8(4, this, str));
    }
}
