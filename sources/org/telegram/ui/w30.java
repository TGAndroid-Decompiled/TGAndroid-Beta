package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class w30 extends org.telegram.ui.Components.pp0 {
    public final a50 R2;

    public w30(a50 a50Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.R2 = a50Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        a50 a50Var = this.R2;
        if (m10 == 1) {
            a50Var.m1().m(((TLRPC.Dialog) hVar.n(0)).f19798id, Integer.valueOf(i10), 41);
        } else {
            a50Var.m1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
