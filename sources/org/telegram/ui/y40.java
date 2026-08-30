package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class y40 extends org.telegram.ui.Components.lq0 {
    public final c60 Y0;

    public y40(c60 c60Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.Y0 = c60Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        int m9 = hVar.m();
        c60 c60Var = this.Y0;
        if (m9 == 1) {
            c60Var.k1().m(((TLRPC.Dialog) hVar.n(0)).f19188id, Integer.valueOf(i10), 41);
        } else {
            c60Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
