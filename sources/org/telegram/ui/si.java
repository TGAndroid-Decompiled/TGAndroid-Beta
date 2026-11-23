package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class si implements org.telegram.messenger.lr {
    public final boolean f52091a;
    public final ti f52092b;

    public si(ti tiVar, boolean z10) {
        this.f52092b = tiVar;
        this.f52091a = z10;
    }

    @Override
    public final void q(boolean z10) {
        bn bnVar = this.f52092b.f52410b;
        if (z10) {
            TLRPC.User user = bnVar.f46187f;
            boolean z11 = this.f52091a;
            if (user != null || z11) {
                org.telegram.messenger.tr messagesStorage = bnVar.getMessagesStorage();
                messagesStorage.f27149a.c(new org.telegram.messenger.zq(messagesStorage, bnVar.f46271l6, new ri(1, this, z11), 0));
                return;
            }
        }
        bnVar.Ta(bnVar.f46359s4, z10);
    }
}
