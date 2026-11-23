package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class si implements org.telegram.messenger.mr {
    public final boolean f52018a;
    public final ti f52019b;

    public si(ti tiVar, boolean z10) {
        this.f52019b = tiVar;
        this.f52018a = z10;
    }

    @Override
    public final void d(boolean z10) {
        bn bnVar = this.f52019b.f52284b;
        if (z10) {
            TLRPC.User user = bnVar.f45972f;
            boolean z11 = this.f52018a;
            if (user != null || z11) {
                org.telegram.messenger.ur messagesStorage = bnVar.getMessagesStorage();
                messagesStorage.f27214a.c(new org.telegram.messenger.ar(messagesStorage, bnVar.f46056l6, new ri(1, this, z11), 0));
                return;
            }
        }
        bnVar.Ta(bnVar.f46144s4, z10);
    }
}
