package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class xl extends av0 {
    public final fo f41893a;

    public xl(fo foVar) {
        this.f41893a = foVar;
    }

    @Override
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return fo.E1(this.f41893a, messageObject, fileLocation, i10, z10, false);
    }
}
