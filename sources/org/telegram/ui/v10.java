package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v10 extends s4 {
    public final x30 V;

    public v10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = x30Var;
    }

    @Override
    public final void c() {
        x30 x30Var = this.V;
        org.telegram.messenger.c cVar = x30Var.f51759l1;
        w10 w10Var = x30Var.f51750j1;
        long dialogId = w10Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(cVar.f21919a).a2(Long.valueOf(dialogId));
            w10Var.H(null, org.telegram.messenger.ac.m(cVar.f21919a, 0, a22), org.telegram.messenger.ac.m(cVar.f21919a, 1, a22), false);
        }
    }
}
