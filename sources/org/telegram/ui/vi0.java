package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vi0 implements RequestDelegate {
    public final int f50708a;
    public final dk0 f50709b;

    public vi0(dk0 dk0Var, int i7) {
        this.f50708a = i7;
        this.f50709b = dk0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50708a) {
            case 0:
                org.telegram.messenger.g0.h3(new oc0(this.f50709b, tL_error, tLObject, 12));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new bd0(21, this.f50709b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ri0(this.f50709b, 5));
                return;
            default:
                org.telegram.messenger.g0.h3(new bd0(20, this.f50709b, tLObject));
                return;
        }
    }
}
