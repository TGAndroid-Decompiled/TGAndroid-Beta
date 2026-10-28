package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z10 implements Utilities.CallbackReturn {
    public final int f46141a;
    public final Object f46142b;

    public z10(Object obj, int i10) {
        this.f46141a = i10;
        this.f46142b = obj;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f46141a;
        Object obj2 = this.f46142b;
        switch (i10) {
            case 0:
                f20 f20Var = (f20) obj2;
                View view = (View) obj;
                f20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.nm0 nm0Var = f20Var.f39131c;
                if (parent != nm0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.k71.K(nm0Var.T(view).f47776f));
            case 1:
                qf0 qf0Var = (qf0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new nf0(qf0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                int i11 = ProfileActivity.R6;
                if (uRLSpan != null) {
                    profileActivity.J4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
