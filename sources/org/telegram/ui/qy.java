package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qy implements RequestDelegate {
    public final int f51556a;
    public final jz f51557b;

    public qy(jz jzVar, int i7) {
        this.f51556a = i7;
        this.f51557b = jzVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51556a) {
            case 0:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.voip.o(20, this.f51557b, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new up(this.f51557b, tL_error, tLObject, 6));
                return;
        }
    }
}
