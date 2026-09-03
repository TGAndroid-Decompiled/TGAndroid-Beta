package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class vc1 extends org.telegram.ui.Components.lq0 {
    public final xc1 Y0;

    public vc1(xc1 xc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.Y0 = xc1Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        int m9 = hVar.m();
        xc1 xc1Var = this.Y0;
        if (m9 == 1) {
            xc1Var.f43014a.f37988i0.m(((TLRPC.Dialog) hVar.n(0)).f20849id, Integer.valueOf(i10), 61);
        } else {
            xc1Var.f43014a.f37988i0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
