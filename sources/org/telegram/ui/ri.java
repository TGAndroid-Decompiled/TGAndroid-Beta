package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ri implements org.telegram.messenger.nr {
    public final boolean f50957a;
    public final si f50958b;

    public ri(si siVar, boolean z10) {
        this.f50958b = siVar;
        this.f50957a = z10;
    }

    @Override
    public final void j(boolean z10) {
        an anVar = this.f50958b.f51228b;
        if (z10) {
            TLRPC.User user = anVar.f45187f;
            boolean z11 = this.f50957a;
            if (user != null || z11) {
                org.telegram.messenger.vr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.f27220a.c(new org.telegram.messenger.br(messagesStorage, anVar.f45259k6, new qi(1, this, z11), 0));
                return;
            }
        }
        anVar.Ta(anVar.f45358s4, z10);
    }
}
