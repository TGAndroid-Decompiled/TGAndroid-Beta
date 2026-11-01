package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xl extends xr0 {
    public final un f43398a;

    public xl(un unVar) {
        this.f43398a = unVar;
    }

    @Override
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return un.O1(this.f43398a, kjVar, fileLocation, i10, z10, false);
    }

    @Override
    public final boolean L() {
        return true;
    }
}
