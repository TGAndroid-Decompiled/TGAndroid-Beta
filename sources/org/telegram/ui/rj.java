package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class rj implements MessagesStorage.BooleanCallback {
    public final boolean f41666a;
    public final sj f41667b;

    public rj(sj sjVar, boolean z10) {
        this.f41667b = sjVar;
        this.f41666a = z10;
    }

    @Override
    public final void run(boolean z10) {
        eo eoVar = this.f41667b.f41937b;
        if (z10) {
            TLRPC.User user = eoVar.f37253f;
            boolean z11 = this.f41666a;
            if (user != null || z11) {
                eoVar.getMessagesStorage().getMessagesCount(eoVar.T5, new qj(1, this, z11));
                return;
            }
        }
        eoVar.va(eoVar.f37232d4, z10);
    }
}
