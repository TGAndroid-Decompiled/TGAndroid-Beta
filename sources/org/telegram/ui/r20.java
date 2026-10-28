package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r20 implements RequestDelegate {
    public final int f42833a;
    public final x50 f42834b;

    public r20(x50 x50Var, int i10) {
        this.f42833a = i10;
        this.f42834b = x50Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42833a) {
            case 0:
                x50.u(this.f42834b, tLObject);
                return;
            default:
                x50.s(this.f42834b, tLObject);
                return;
        }
    }
}
