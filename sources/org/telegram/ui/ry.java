package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ry implements RequestDelegate {
    public final int f51788a;
    public final kz f51789b;

    public ry(kz kzVar, int i7) {
        this.f51788a = i7;
        this.f51789b = kzVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51788a) {
            case 0:
                org.telegram.messenger.g0.g3(new ss(16, this.f51789b, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new up(this.f51789b, tL_error, tLObject, 6));
                return;
        }
    }
}
