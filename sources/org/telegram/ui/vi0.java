package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vi0 implements RequestDelegate {
    public final int f52238a;
    public final ek0 f52239b;

    public vi0(ek0 ek0Var, int i7) {
        this.f52238a = i7;
        this.f52239b = ek0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52238a) {
            case 0:
                org.telegram.messenger.g0.h3(new lc0(this.f52239b, tL_error, tLObject, 12));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new jd0(17, this.f52239b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ri0(this.f52239b, 5));
                return;
            default:
                org.telegram.messenger.g0.h3(new jd0(16, this.f52239b, tLObject));
                return;
        }
    }
}
