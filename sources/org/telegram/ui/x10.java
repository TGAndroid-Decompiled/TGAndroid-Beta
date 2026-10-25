package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x10 implements Utilities.CallbackReturn {
    public final int f45623a;
    public final Object f45624b;

    public x10(Object obj, int i10) {
        this.f45623a = i10;
        this.f45624b = obj;
    }

    @Override
    public final Object run(Object obj) {
        int i10 = this.f45623a;
        Object obj2 = this.f45624b;
        switch (i10) {
            case 0:
                d20 d20Var = (d20) obj2;
                View view = (View) obj;
                d20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.mm0 mm0Var = d20Var.f38713c;
                if (parent != mm0Var) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!org.telegram.ui.Components.j71.K(mm0Var.T(view).f47738f));
            case 1:
                of0 of0Var = (of0) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new lf0(of0Var, 1));
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
