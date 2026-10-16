package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class xl extends zu0 {
    public final fo f41594a;

    public xl(fo foVar) {
        this.f41594a = foVar;
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return fo.E1(this.f41594a, messageObject, fileLocation, i10, z10, false);
    }
}
