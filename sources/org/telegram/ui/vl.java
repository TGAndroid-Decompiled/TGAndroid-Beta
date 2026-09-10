package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class vl extends tu0 {
    public final eo f37583a;

    public vl(eo eoVar) {
        this.f37583a = eoVar;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return eo.A1(this.f37583a, messageObject, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean K() {
        return true;
    }
}
