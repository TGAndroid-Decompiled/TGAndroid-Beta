package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class yb1 extends org.telegram.ui.Components.dr0 {
    public final ac1 f43384b1;

    public yb1(ac1 ac1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f43384b1 = ac1Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        ac1 ac1Var = this.f43384b1;
        if (m10 == 1) {
            ac1Var.f35391a.f39132l0.m(((TLRPC.Dialog) hVar.n(0)).f20276id, Integer.valueOf(i10), 61);
        } else {
            ac1Var.f35391a.f39132l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
