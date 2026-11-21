package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class si implements org.telegram.messenger.lr {
    public final boolean f52045a;
    public final ti f52046b;

    public si(ti tiVar, boolean z10) {
        this.f52046b = tiVar;
        this.f52045a = z10;
    }

    @Override
    public final void d(boolean z10) {
        bn bnVar = this.f52046b.f52334b;
        if (z10) {
            TLRPC.User user = bnVar.f46015f;
            boolean z11 = this.f52045a;
            if (user != null || z11) {
                org.telegram.messenger.tr messagesStorage = bnVar.getMessagesStorage();
                messagesStorage.f27080a.c(new org.telegram.messenger.zq(messagesStorage, bnVar.f46099l6, new ri(1, this, z11), 0));
                return;
            }
        }
        bnVar.Ta(bnVar.f46187s4, z10);
    }
}
