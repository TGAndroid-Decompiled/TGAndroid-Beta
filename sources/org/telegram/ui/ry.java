package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ry implements RequestDelegate {
    public final int f51826a;
    public final kz f51827b;

    public ry(kz kzVar, int i7) {
        this.f51826a = i7;
        this.f51827b = kzVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51826a) {
            case 0:
                org.telegram.messenger.g0.g3(new vs(14, this.f51827b, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new up(this.f51827b, tL_error, tLObject, 6));
                return;
        }
    }
}
