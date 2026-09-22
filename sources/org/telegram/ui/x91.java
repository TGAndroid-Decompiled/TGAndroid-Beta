package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x91 implements RequestDelegate {
    public final int f39424a;
    public final bb1 f39425b;

    public x91(bb1 bb1Var, int i10) {
        this.f39424a = i10;
        this.f39425b = bb1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39424a) {
            case 0:
                bb1.U(this.f39425b, tLObject);
                return;
            default:
                bb1.V(this.f39425b, tLObject);
                return;
        }
    }
}
