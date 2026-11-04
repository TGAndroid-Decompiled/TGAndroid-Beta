package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class t20 extends org.telegram.ui.Components.oo0 {
    public final x30 S2;

    public t20(x30 x30Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.S2 = x30Var;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        x30 x30Var = this.S2;
        if (m10 == 1) {
            x30Var.m1().m(((TLRPC.Dialog) hVar.n(0)).f27005id, Integer.valueOf(i3), 41);
        } else {
            x30Var.m1().k(0L, 41, Integer.valueOf(i3), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
