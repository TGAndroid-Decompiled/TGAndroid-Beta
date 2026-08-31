package org.telegram.ui;

import android.webkit.JavascriptInterface;
import org.telegram.messenger.AndroidUtilities;
public final class xi1 {
    public final yi1 f43081a;

    public xi1(yi1 yi1Var) {
        this.f43081a = yi1Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        AndroidUtilities.runOnUIThread(new mg1(7, this, str));
    }
}
