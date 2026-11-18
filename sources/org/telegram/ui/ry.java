package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ry implements RequestDelegate {
    public final int f51813a;
    public final kz f51814b;

    public ry(kz kzVar, int i7) {
        this.f51813a = i7;
        this.f51814b = kzVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51813a) {
            case 0:
                org.telegram.messenger.g0.g3(new vs(14, this.f51814b, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new up(this.f51814b, tL_error, tLObject, 6));
                return;
        }
    }
}
