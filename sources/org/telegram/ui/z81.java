package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class z81 extends org.telegram.ui.Components.op0 {
    public final b91 R2;

    public z81(b91 b91Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.R2 = b91Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        int m10 = hVar.m();
        b91 b91Var = this.R2;
        if (m10 == 1) {
            b91Var.f36142a.m0.m(((TLRPC.Dialog) hVar.n(0)).f19797id, Integer.valueOf(i10), 61);
        } else {
            b91Var.f36142a.m0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        }
    }
}
