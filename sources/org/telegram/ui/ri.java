package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ri implements org.telegram.messenger.qr {
    public final boolean f49500a;
    public final si f49501b;

    public ri(si siVar, boolean z9) {
        this.f49501b = siVar;
        this.f49500a = z9;
    }

    @Override
    public final void k(boolean z9) {
        an anVar = this.f49501b.f49758b;
        if (z9) {
            TLRPC.User user = anVar.f43761f;
            boolean z10 = this.f49500a;
            if (user != null || z10) {
                org.telegram.messenger.yr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.f26688a.c(new org.telegram.messenger.er(messagesStorage, anVar.f43818j6, new qi(1, this, z10), 0));
                return;
            }
        }
        anVar.Qa(anVar.f43915r4, z9);
    }
}
