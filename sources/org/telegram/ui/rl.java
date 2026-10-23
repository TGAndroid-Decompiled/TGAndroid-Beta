package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class rl extends zt0 {
    public final qn f41245a;

    public rl(qn qnVar) {
        this.f41245a = qnVar;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return qn.E1(this.f41245a, messageObject, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean L() {
        return true;
    }
}
