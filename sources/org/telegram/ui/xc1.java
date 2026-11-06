package org.telegram.ui;

import android.webkit.JavascriptInterface;
public final class xc1 {
    public final yc1 f51839a;

    public xc1(yc1 yc1Var) {
        this.f51839a = yc1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.n(28, this, str));
    }
}
