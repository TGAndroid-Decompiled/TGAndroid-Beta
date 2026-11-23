package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class si implements org.telegram.messenger.mr {
    public final boolean f52049a;
    public final ti f52050b;

    public si(ti tiVar, boolean z10) {
        this.f52050b = tiVar;
        this.f52049a = z10;
    }

    @Override
    public final void d(boolean z10) {
        bn bnVar = this.f52050b.f52338b;
        if (z10) {
            TLRPC.User user = bnVar.f46019f;
            boolean z11 = this.f52049a;
            if (user != null || z11) {
                org.telegram.messenger.ur messagesStorage = bnVar.getMessagesStorage();
                messagesStorage.f27250a.c(new org.telegram.messenger.ar(messagesStorage, bnVar.f46103l6, new ri(1, this, z11), 0));
                return;
            }
        }
        bnVar.Ta(bnVar.f46191s4, z10);
    }
}
