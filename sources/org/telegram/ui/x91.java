package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x91 implements RequestDelegate {
    public final int f42678a;
    public final bb1 f42679b;

    public x91(bb1 bb1Var, int i10) {
        this.f42678a = i10;
        this.f42679b = bb1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42678a) {
            case 0:
                bb1.U(this.f42679b, tLObject);
                return;
            default:
                bb1.V(this.f42679b, tLObject);
                return;
        }
    }
}
