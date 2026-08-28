package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t10 implements Utilities.CallbackReturn {
    public final int f42805a;
    public final Object f42806b;

    public t10(Object obj, int i9) {
        this.f42805a = i9;
        this.f42806b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f42805a) {
            case 0:
                x10 x10Var = (x10) this.f42806b;
                View view = (View) obj;
                x10Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.wk0 wk0Var = x10Var.f44314c;
                if (parent != wk0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.z41.K(wk0Var.T(view).f5505f));
            case 1:
                of0 of0Var = (of0) this.f42806b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new lf0(of0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f42806b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
