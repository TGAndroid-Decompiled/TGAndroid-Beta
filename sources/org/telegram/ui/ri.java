package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ri implements org.telegram.messenger.qr {
    public final boolean f49498a;
    public final si f49499b;

    public ri(si siVar, boolean z9) {
        this.f49499b = siVar;
        this.f49498a = z9;
    }

    @Override
    public final void k(boolean z9) {
        an anVar = this.f49499b.f49769b;
        if (z9) {
            TLRPC.User user = anVar.f43791f;
            boolean z10 = this.f49498a;
            if (user != null || z10) {
                org.telegram.messenger.yr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.f26719a.c(new org.telegram.messenger.er(messagesStorage, anVar.f43848j6, new qi(1, this, z10), 0));
                return;
            }
        }
        anVar.Qa(anVar.f43945r4, z9);
    }
}
