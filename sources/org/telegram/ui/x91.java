package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x91 implements RequestDelegate {
    public final int f39400a;
    public final bb1 f39401b;

    public x91(bb1 bb1Var, int i10) {
        this.f39400a = i10;
        this.f39401b = bb1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39400a) {
            case 0:
                bb1.U(this.f39401b, tLObject);
                return;
            default:
                bb1.V(this.f39401b, tLObject);
                return;
        }
    }
}
