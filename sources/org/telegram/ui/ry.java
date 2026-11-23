package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ry implements RequestDelegate {
    public final int f51792a;
    public final kz f51793b;

    public ry(kz kzVar, int i7) {
        this.f51792a = i7;
        this.f51793b = kzVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51792a) {
            case 0:
                org.telegram.messenger.g0.g3(new ss(16, this.f51793b, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new up(this.f51793b, tL_error, tLObject, 6));
                return;
        }
    }
}
