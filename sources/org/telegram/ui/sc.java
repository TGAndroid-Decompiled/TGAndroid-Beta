package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sc implements RequestDelegate {
    public final int f51963a;
    public final ad f51964b;

    public sc(ad adVar, int i7) {
        this.f51963a = i7;
        this.f51964b = adVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51963a) {
            case 0:
                org.telegram.messenger.g0.g3(new k9(11, this.f51964b, tLObject));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new k9(9, this.f51964b, tL_error));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.g3(new rc(this.f51964b, 3));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new o1(this.f51964b, tL_error, tLObject, 11));
                return;
        }
    }
}
