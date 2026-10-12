package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class rj1 {
    public final sj1 f41669a;

    public rj1(sj1 sj1Var) {
        this.f41669a = sj1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s(21, this, str));
    }
}
