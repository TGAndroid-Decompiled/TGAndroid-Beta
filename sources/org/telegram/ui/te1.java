package org.telegram.ui;

import android.webkit.JavascriptInterface;
public final class te1 {
    public final ue1 f41631a;

    public te1(ue1 ue1Var) {
        this.f41631a = ue1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.m2(22, this, str));
    }
}
