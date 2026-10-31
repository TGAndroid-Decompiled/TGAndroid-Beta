package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class z20 extends q4 {
    public final b50 U;

    public z20(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = b50Var;
    }

    @Override
    public final void c() {
        b50 b50Var = this.U;
        org.telegram.messenger.c cVar = b50Var.f36036k1;
        a30 a30Var = b50Var.f36026i1;
        long dialogId = a30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(cVar.f14863a).Z1(Long.valueOf(dialogId));
            a30Var.H(null, org.telegram.messenger.ic.m(cVar.f14863a, 0, Z1), org.telegram.messenger.ic.m(cVar.f14863a, 1, Z1), false);
        }
    }
}
