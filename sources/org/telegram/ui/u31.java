package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u31 implements RequestDelegate {
    public final int f50202a;
    public final c51 f50203b;

    public u31(c51 c51Var, int i7) {
        this.f50202a = i7;
        this.f50203b = c51Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50202a) {
            case 0:
                c51.a0(this.f50203b, tLObject);
                return;
            default:
                c51.Z(this.f50203b, tLObject);
                return;
        }
    }
}
