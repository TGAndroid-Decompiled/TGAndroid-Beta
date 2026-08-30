package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class ui1 {
    public final vi1 f38953a;

    public ui1(vi1 vi1Var) {
        this.f38953a = vi1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new kg1(8, this, str));
    }
}
