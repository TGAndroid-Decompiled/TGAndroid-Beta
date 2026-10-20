package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t10 implements Utilities.CallbackReturn {
    public final int f41577a;
    public final Object f41578b;

    public t10(Object obj, int i10) {
        this.f41577a = i10;
        this.f41578b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f41577a) {
            case 0:
                y10 y10Var = (y10) this.f41578b;
                View view = (View) obj;
                y10Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.jm0 jm0Var = y10Var.f43325c;
                if (parent != jm0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.u61.K(jm0Var.T(view).f45920f));
            case 1:
                mf0 mf0Var = (mf0) this.f41578b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new jf0(mf0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f41578b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.B4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
