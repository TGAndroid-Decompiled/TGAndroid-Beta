package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class si implements org.telegram.messenger.lr {
    public final boolean f51998a;
    public final ti f51999b;

    public si(ti tiVar, boolean z10) {
        this.f51999b = tiVar;
        this.f51998a = z10;
    }

    @Override
    public final void d(boolean z10) {
        bn bnVar = this.f51999b.f52293b;
        if (z10) {
            TLRPC.User user = bnVar.f46001f;
            boolean z11 = this.f51998a;
            if (user != null || z11) {
                org.telegram.messenger.tr messagesStorage = bnVar.getMessagesStorage();
                messagesStorage.f27054a.c(new org.telegram.messenger.zq(messagesStorage, bnVar.f46085l6, new ri(1, this, z11), 0));
                return;
            }
        }
        bnVar.Ta(bnVar.f46173s4, z10);
    }
}
