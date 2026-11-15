package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class y20 extends org.telegram.ui.Components.po0 {
    public final c40 V2;

    public y20(c40 c40Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.V2 = c40Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        c40 c40Var = this.V2;
        if (m10 == 1) {
            c40Var.n1().m(((TLRPC.Dialog) hVar.n(0)).f28055id, Integer.valueOf(i7), 41);
        } else {
            c40Var.n1().k(0L, 41, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
