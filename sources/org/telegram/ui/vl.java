package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class vl extends iu0 {
    public final wn f44378a;

    public vl(wn wnVar) {
        this.f44378a = wnVar;
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return wn.H1(this.f44378a, messageObject, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean L() {
        return true;
    }
}
