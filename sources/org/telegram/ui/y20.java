package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y20 implements RequestDelegate {
    public final int f40125a;
    public final e60 f40126b;

    public y20(e60 e60Var, int i10) {
        this.f40125a = i10;
        this.f40126b = e60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40125a) {
            case 0:
                e60.u(this.f40126b, tLObject);
                return;
            default:
                e60.s(this.f40126b, tLObject);
                return;
        }
    }
}
