package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class y40 extends org.telegram.ui.Components.vq0 {
    public final d60 f40051b1;

    public y40(d60 d60Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.f40051b1 = d60Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = iVar.m();
        d60 d60Var = this.f40051b1;
        if (m10 == 1) {
            d60Var.k1().m(((TLRPC.Dialog) iVar.n(0)).f18339id, Integer.valueOf(i10), 41);
        } else {
            d60Var.k1().k(0L, 41, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
        }
    }
}
