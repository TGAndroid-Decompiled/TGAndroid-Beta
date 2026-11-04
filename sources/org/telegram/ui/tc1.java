package org.telegram.ui;

import android.webkit.JavascriptInterface;
public final class tc1 {
    public final uc1 f49773a;

    public tc1(uc1 uc1Var) {
        this.f49773a = uc1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        org.telegram.messenger.g0.h3(new hc1(3, this, str));
    }
}
