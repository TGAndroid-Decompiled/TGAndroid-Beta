package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ri implements org.telegram.messenger.nr {
    public final boolean f50956a;
    public final si f50957b;

    public ri(si siVar, boolean z10) {
        this.f50957b = siVar;
        this.f50956a = z10;
    }

    @Override
    public final void j(boolean z10) {
        an anVar = this.f50957b.f51224b;
        if (z10) {
            TLRPC.User user = anVar.f45186f;
            boolean z11 = this.f50956a;
            if (user != null || z11) {
                org.telegram.messenger.vr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.f27219a.c(new org.telegram.messenger.ar(messagesStorage, anVar.f45258k6, new qi(1, this, z11), 0));
                return;
            }
        }
        anVar.Ta(anVar.f45357s4, z10);
    }
}
