package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x10 implements Utilities.CallbackReturn {
    public final int f43478a;
    public final Object f43479b;

    public x10(Object obj, int i10) {
        this.f43478a = i10;
        this.f43479b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f43478a) {
            case 0:
                b20 b20Var = (b20) this.f43479b;
                View view = (View) obj;
                b20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.mm0 mm0Var = b20Var.f35826c;
                if (parent != mm0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.b71.K(mm0Var.T(view).f46346f));
            case 1:
                rf0 rf0Var = (rf0) this.f43479b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new of0(rf0Var, 1));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f43479b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan != null) {
                    profileActivity.D4(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }
}
