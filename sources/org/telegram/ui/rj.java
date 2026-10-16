package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class rj implements MessagesStorage.BooleanCallback {
    public final boolean f39530a;
    public final sj f39531b;

    public rj(sj sjVar, boolean z10) {
        this.f39531b = sjVar;
        this.f39530a = z10;
    }

    @Override
    public final void run(boolean z10) {
        fo foVar = this.f39531b.f39833b;
        if (z10) {
            TLRPC.User user = foVar.f35636f;
            boolean z11 = this.f39530a;
            if (user != null || z11) {
                foVar.getMessagesStorage().getMessagesCount(foVar.T5, new qj(1, this, z11));
                return;
            }
        }
        foVar.va(foVar.f35616d4, z10);
    }
}
