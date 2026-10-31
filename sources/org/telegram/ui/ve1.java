package org.telegram.ui;

import android.webkit.JavascriptInterface;
public final class ve1 {
    public final we1 f42717a;

    public ve1(we1 we1Var) {
        this.f42717a = we1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.k3(21, this, str));
    }
}
