package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ti implements org.telegram.messenger.qr {
    public final boolean f50188a;
    public final ui f50189b;

    public ti(ui uiVar, boolean z9) {
        this.f50189b = uiVar;
        this.f50188a = z9;
    }

    @Override
    public final void k(boolean z9) {
        cn cnVar = this.f50189b.f50413b;
        if (z9) {
            TLRPC.User user = cnVar.f44446f;
            boolean z10 = this.f50188a;
            if (user != null || z10) {
                org.telegram.messenger.yr messagesStorage = cnVar.getMessagesStorage();
                messagesStorage.f26719a.c(new org.telegram.messenger.er(messagesStorage, cnVar.f44504j6, new si(1, this, z10), 0));
                return;
            }
        }
        cnVar.Sa(cnVar.f44602r4, z9);
    }
}
