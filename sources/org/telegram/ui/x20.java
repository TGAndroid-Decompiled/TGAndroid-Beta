package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x20 implements RequestDelegate {
    public final int f42942a;
    public final d60 f42943b;

    public x20(d60 d60Var, int i10) {
        this.f42942a = i10;
        this.f42943b = d60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42942a) {
            case 0:
                d60.u(this.f42943b, tLObject);
                return;
            default:
                d60.s(this.f42943b, tLObject);
                return;
        }
    }
}
