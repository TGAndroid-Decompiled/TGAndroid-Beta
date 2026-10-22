package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class wb1 extends org.telegram.ui.Components.fr0 {
    public final yb1 f42537c1;

    public wb1(yb1 yb1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f42537c1 = yb1Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        yb1 yb1Var = this.f42537c1;
        if (m10 == 1) {
            yb1Var.f43446a.f38555l0.m(((TLRPC.Dialog) hVar.n(0)).f20283id, Integer.valueOf(i10), 61);
        } else {
            yb1Var.f43446a.f38555l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
