package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class tl extends tu0 {
    public final zn f42205a;

    public tl(zn znVar) {
        this.f42205a = znVar;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return zn.E1(this.f42205a, messageObject, fileLocation, i10, z10, false);
    }
}
