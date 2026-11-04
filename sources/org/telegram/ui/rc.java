package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rc implements RequestDelegate {
    public final int f49192a;
    public final ad f49193b;

    public rc(ad adVar, int i3) {
        this.f49192a = i3;
        this.f49193b = adVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49192a) {
            case 0:
                org.telegram.messenger.g0.h3(new sc(1, this.f49193b, tLObject));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(29, this.f49193b, tL_error));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new qc(this.f49193b, 3));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new p1(this.f49193b, tL_error, tLObject, 11));
                return;
        }
    }
}
