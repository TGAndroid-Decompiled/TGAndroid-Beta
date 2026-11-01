package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class y20 extends q4 {
    public final a50 U;

    public y20(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = a50Var;
    }

    @Override
    public final void c() {
        a50 a50Var = this.U;
        org.telegram.messenger.c cVar = a50Var.f35620k1;
        z20 z20Var = a50Var.f35610i1;
        long dialogId = z20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User Z1 = org.telegram.messenger.wp.r1(cVar.f15043a).Z1(Long.valueOf(dialogId));
            z20Var.H(null, org.telegram.messenger.jc.m(cVar.f15043a, 0, Z1), org.telegram.messenger.jc.m(cVar.f15043a, 1, Z1), false);
        }
    }
}
