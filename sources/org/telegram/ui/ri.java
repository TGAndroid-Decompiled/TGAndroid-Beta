package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ri implements org.telegram.messenger.qr {
    public final boolean f49519a;
    public final si f49520b;

    public ri(si siVar, boolean z9) {
        this.f49520b = siVar;
        this.f49519a = z9;
    }

    @Override
    public final void k(boolean z9) {
        an anVar = this.f49520b.f49778b;
        if (z9) {
            TLRPC.User user = anVar.f43785f;
            boolean z10 = this.f49519a;
            if (user != null || z10) {
                org.telegram.messenger.yr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.f26696a.c(new org.telegram.messenger.er(messagesStorage, anVar.f43842j6, new qi(1, this, z10), 0));
                return;
            }
        }
        anVar.Qa(anVar.f43939r4, z9);
    }
}
