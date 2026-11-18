package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class si implements org.telegram.messenger.lr {
    public final boolean f52000a;
    public final ti f52001b;

    public si(ti tiVar, boolean z10) {
        this.f52001b = tiVar;
        this.f52000a = z10;
    }

    @Override
    public final void d(boolean z10) {
        bn bnVar = this.f52001b.f52288b;
        if (z10) {
            TLRPC.User user = bnVar.f45992f;
            boolean z11 = this.f52000a;
            if (user != null || z11) {
                org.telegram.messenger.tr messagesStorage = bnVar.getMessagesStorage();
                messagesStorage.f27052a.c(new org.telegram.messenger.zq(messagesStorage, bnVar.f46076l6, new ri(1, this, z11), 0));
                return;
            }
        }
        bnVar.Ta(bnVar.f46164s4, z10);
    }
}
