package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class z10 extends q4 {
    public final c40 V;

    public z10(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = c40Var;
    }

    @Override
    public final void c() {
        c40 c40Var = this.V;
        org.telegram.messenger.c cVar = c40Var.f45940o1;
        a20 a20Var = c40Var.f45931m1;
        long dialogId = a20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User a22 = org.telegram.messenger.np.s1(cVar.f22782a).a2(Long.valueOf(dialogId));
            a20Var.H(null, org.telegram.messenger.gc.m(cVar.f22782a, 0, a22), org.telegram.messenger.gc.m(cVar.f22782a, 1, a22), false);
        }
    }
}
