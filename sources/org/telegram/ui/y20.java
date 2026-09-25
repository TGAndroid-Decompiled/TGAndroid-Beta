package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y20 implements RequestDelegate {
    public final int f40034a;
    public final d60 f40035b;

    public y20(d60 d60Var, int i10) {
        this.f40034a = i10;
        this.f40035b = d60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40034a) {
            case 0:
                d60.u(this.f40035b, tLObject);
                return;
            default:
                d60.s(this.f40035b, tLObject);
                return;
        }
    }
}
