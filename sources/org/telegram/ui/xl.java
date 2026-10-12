package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class xl extends wu0 {
    public final eo f44038a;

    public xl(eo eoVar) {
        this.f44038a = eoVar;
    }

    @Override
    public final gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return eo.E1(this.f44038a, messageObject, fileLocation, i10, z10, false);
    }
}
