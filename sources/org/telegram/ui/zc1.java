package org.telegram.ui;

import android.webkit.JavascriptInterface;
public final class zc1 {
    public final ad1 f54592a;

    public zc1(ad1 ad1Var) {
        this.f54592a = ad1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.r(22, this, str));
    }
}
