package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class tl extends gu0 {
    public final un f43866a;

    public tl(un unVar) {
        this.f43866a = unVar;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return un.G1(this.f43866a, messageObject, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean L() {
        return true;
    }
}
