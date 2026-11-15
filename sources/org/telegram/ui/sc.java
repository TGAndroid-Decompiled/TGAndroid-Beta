package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sc implements RequestDelegate {
    public final int f51190a;
    public final ad f51191b;

    public sc(ad adVar, int i7) {
        this.f51190a = i7;
        this.f51191b = adVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51190a) {
            case 0:
                org.telegram.messenger.g0.h3(new u5(15, this.f51191b, tLObject));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new u5(13, this.f51191b, tL_error));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new rc(this.f51191b, 3));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new o1(this.f51191b, tL_error, tLObject, 11));
                return;
        }
    }
}
