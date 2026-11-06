package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ri implements org.telegram.messenger.qr {
    public final boolean f49520a;
    public final si f49521b;

    public ri(si siVar, boolean z9) {
        this.f49521b = siVar;
        this.f49520a = z9;
    }

    @Override
    public final void k(boolean z9) {
        an anVar = this.f49521b.f49779b;
        if (z9) {
            TLRPC.User user = anVar.f43786f;
            boolean z10 = this.f49520a;
            if (user != null || z10) {
                org.telegram.messenger.yr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.f26688a.c(new org.telegram.messenger.er(messagesStorage, anVar.f43843j6, new qi(1, this, z10), 0));
                return;
            }
        }
        anVar.Qa(anVar.f43940r4, z9);
    }
}
