package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ti implements org.telegram.messenger.qr {
    public final boolean f50287a;
    public final ui f50288b;

    public ti(ui uiVar, boolean z9) {
        this.f50288b = uiVar;
        this.f50287a = z9;
    }

    @Override
    public final void k(boolean z9) {
        cn cnVar = this.f50288b.f50508b;
        if (z9) {
            TLRPC.User user = cnVar.f44487f;
            boolean z10 = this.f50287a;
            if (user != null || z10) {
                org.telegram.messenger.yr messagesStorage = cnVar.getMessagesStorage();
                messagesStorage.f26723a.c(new org.telegram.messenger.er(messagesStorage, cnVar.f44545j6, new si(1, this, z10), 0));
                return;
            }
        }
        cnVar.Sa(cnVar.f44643r4, z9);
    }
}
