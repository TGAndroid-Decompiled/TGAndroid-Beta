package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v31 implements RequestDelegate {
    public final int f50561a;
    public final d51 f50562b;

    public v31(d51 d51Var, int i7) {
        this.f50561a = i7;
        this.f50562b = d51Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50561a) {
            case 0:
                d51.a0(this.f50562b, tLObject);
                return;
            default:
                d51.Z(this.f50562b, tLObject);
                return;
        }
    }
}
