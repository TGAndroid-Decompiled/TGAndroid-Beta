package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class w10 implements Utilities.CallbackReturn {

    public final int f43571a;

    public final Object f43572b;

    public w10(Object obj, int i10) {
        this.f43571a = i10;
        this.f43572b = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f43571a) {
            case 0:
                a20 a20Var = (a20) this.f43572b;
                View view = (View) obj;
                a20Var.getClass();
                ViewParent parent = view.getParent();
                org.telegram.ui.Components.zk0 zk0Var = a20Var.f36342c;
                return parent != zk0Var ? Boolean.FALSE : Boolean.valueOf(!org.telegram.ui.Components.b51.K(zk0Var.T(view).f5793f));
            case 1:
                rf0 rf0Var = (rf0) this.f43572b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    return Boolean.FALSE;
                }
                AndroidUtilities.runOnUIThread(new of0(rf0Var, 1));
                return Boolean.TRUE;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f43572b;
                URLSpan uRLSpan = (URLSpan) obj;
                if (uRLSpan == null) {
                    return Boolean.FALSE;
                }
                profileActivity.B4(uRLSpan.getURL(), null);
                return Boolean.TRUE;
        }
    }
}
