package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class tl extends uu0 {
    public final zn f42026a;

    public tl(zn znVar) {
        this.f42026a = znVar;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return zn.E1(this.f42026a, messageObject, fileLocation, i10, z10, false);
    }
}
