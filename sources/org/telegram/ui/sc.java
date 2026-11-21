package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sc implements RequestDelegate {
    public final int f52003a;
    public final ad f52004b;

    public sc(ad adVar, int i7) {
        this.f52003a = i7;
        this.f52004b = adVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52003a) {
            case 0:
                org.telegram.messenger.g0.g3(new u8(13, this.f52004b, tLObject));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new u8(11, this.f52004b, tL_error));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.g3(new rc(this.f52004b, 3));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new o1(this.f52004b, tL_error, tLObject, 11));
                return;
        }
    }
}
