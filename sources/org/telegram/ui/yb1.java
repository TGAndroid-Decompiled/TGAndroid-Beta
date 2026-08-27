package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

public final class yb1 extends org.telegram.ui.Components.sp0 {
    public final bc1 X0;

    public yb1(bc1 bc1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.X0 = bc1Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int iM = hVar.m();
            bc1 bc1Var = this.X0;
            if (iM == 1) {
                bc1Var.f36778a.f40759h0.m(((TLRPC.Dialog) hVar.n(0)).f22384id, Integer.valueOf(i10), 61);
            } else {
                bc1Var.f36778a.f40759h0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
            }
        }
    }
}
