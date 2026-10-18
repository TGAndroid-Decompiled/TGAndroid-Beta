package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v10 implements Utilities.CallbackReturn {
    public final int f42118a;
    public final Object f42119b;

    public v10(Object obj, int i10) {
        this.f42118a = i10;
        this.f42119b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f42118a) {
            case 0:
                a20 a20Var = (a20) this.f42119b;
                View view = (View) obj;
                a20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.im0 im0Var = a20Var.f35290c;
                if (parent != im0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.s61.K(im0Var.T(view).f45961f));
            case 1:
                of0 of0Var = (of0) this.f42119b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new lf0(of0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f42119b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
