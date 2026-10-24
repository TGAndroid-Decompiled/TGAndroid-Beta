package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x10 implements Utilities.CallbackReturn {
    public final int f43449a;
    public final Object f43450b;

    public x10(Object obj, int i10) {
        this.f43449a = i10;
        this.f43450b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f43449a) {
            case 0:
                b20 b20Var = (b20) this.f43450b;
                View view = (View) obj;
                b20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.lm0 lm0Var = b20Var.f35894c;
                if (parent != lm0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.a71.K(lm0Var.T(view).f46345f));
            case 1:
                qf0 qf0Var = (qf0) this.f43450b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new nf0(qf0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f43450b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.D4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
