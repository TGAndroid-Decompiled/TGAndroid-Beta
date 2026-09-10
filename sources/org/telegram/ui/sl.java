package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class sl extends tu0 {
    public final eo f36719a;

    public sl(eo eoVar) {
        this.f36719a = eoVar;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return eo.A1(this.f36719a, messageObject, fileLocation, i10, z10, false);
    }
}
