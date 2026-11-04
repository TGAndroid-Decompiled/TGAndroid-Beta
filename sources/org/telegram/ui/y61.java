package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class y61 extends org.telegram.ui.Components.oo0 {
    public final a71 S2;

    public y61(a71 a71Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.S2 = a71Var;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        a71 a71Var = this.S2;
        if (m10 == 1) {
            a71Var.f43680a.f47181n0.m(((TLRPC.Dialog) hVar.n(0)).f27005id, Integer.valueOf(i3), 61);
        } else {
            a71Var.f43680a.f47181n0.k(0L, 61, Integer.valueOf(i3), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
