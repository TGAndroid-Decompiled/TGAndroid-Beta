package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class rj implements MessagesStorage.BooleanCallback {
    public final boolean f39812a;
    public final sj f39813b;

    public rj(sj sjVar, boolean z10) {
        this.f39813b = sjVar;
        this.f39812a = z10;
    }

    @Override
    public final void run(boolean z10) {
        fo foVar = this.f39813b.f40157b;
        if (z10) {
            TLRPC.User user = foVar.f35935f;
            boolean z11 = this.f39812a;
            if (user != null || z11) {
                foVar.getMessagesStorage().getMessagesCount(foVar.T5, new qj(1, this, z11));
                return;
            }
        }
        foVar.va(foVar.f35915d4, z10);
    }
}
