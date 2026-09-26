package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y20 implements RequestDelegate {
    public final int f40033a;
    public final d60 f40034b;

    public y20(d60 d60Var, int i10) {
        this.f40033a = i10;
        this.f40034b = d60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40033a) {
            case 0:
                d60.u(this.f40034b, tLObject);
                return;
            default:
                d60.s(this.f40034b, tLObject);
                return;
        }
    }
}
