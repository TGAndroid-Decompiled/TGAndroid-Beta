package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class sl extends bu0 {
    public final sn f41430a;

    public sl(sn snVar) {
        this.f41430a = snVar;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return sn.E1(this.f41430a, messageObject, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean L() {
        return true;
    }
}
