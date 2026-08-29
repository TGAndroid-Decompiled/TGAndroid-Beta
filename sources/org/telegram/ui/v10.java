package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v10 implements Utilities.CallbackReturn {
    public final int f43390a;
    public final Object f43391b;

    public v10(Object obj, int i10) {
        this.f43390a = i10;
        this.f43391b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f43390a) {
            case 0:
                z10 z10Var = (z10) this.f43391b;
                View view = (View) obj;
                z10Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.jl0 jl0Var = z10Var.f45015c;
                if (parent != jl0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.k51.K(jl0Var.T(view).f6436f));
            case 1:
                of0 of0Var = (of0) this.f43391b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new kf0(of0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f43391b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
