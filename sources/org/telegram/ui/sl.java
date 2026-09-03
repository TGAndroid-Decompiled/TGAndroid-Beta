package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class sl extends fu0 {
    public final zn f38263a;

    public sl(zn znVar) {
        this.f38263a = znVar;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return zn.A1(this.f38263a, messageObject, fileLocation, i10, z4, false);
    }

    @Override
    public final boolean K() {
        return true;
    }
}
