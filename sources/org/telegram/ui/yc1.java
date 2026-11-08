package org.telegram.ui;

import android.webkit.JavascriptInterface;
public final class yc1 {
    public final zc1 f52198a;

    public yc1(zc1 zc1Var) {
        this.f52198a = zc1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.n(28, this, str));
    }
}
