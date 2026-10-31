package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xl extends yr0 {
    public final un f43596a;

    public xl(un unVar) {
        this.f43596a = unVar;
    }

    @Override
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return un.N1(this.f43596a, jjVar, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean L() {
        return true;
    }
}
