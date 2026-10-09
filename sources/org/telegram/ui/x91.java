package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x91 implements RequestDelegate {
    public final int f43888a;
    public final bb1 f43889b;

    public x91(bb1 bb1Var, int i10) {
        this.f43888a = i10;
        this.f43889b = bb1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43888a) {
            case 0:
                bb1.U(this.f43889b, tLObject);
                return;
            default:
                bb1.V(this.f43889b, tLObject);
                return;
        }
    }
}
