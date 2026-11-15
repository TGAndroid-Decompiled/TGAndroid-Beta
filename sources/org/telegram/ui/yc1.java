package org.telegram.ui;

import android.webkit.JavascriptInterface;
public final class yc1 {
    public final zc1 f53490a;

    public yc1(zc1 zc1Var) {
        this.f53490a = zc1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.r(24, this, str));
    }
}
