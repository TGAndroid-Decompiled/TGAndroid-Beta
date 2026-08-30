package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w20 implements RequestDelegate {
    public final int f39316a;
    public final c60 f39317b;

    public w20(c60 c60Var, int i10) {
        this.f39316a = i10;
        this.f39317b = c60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39316a) {
            case 0:
                c60.u(this.f39317b, tLObject);
                return;
            default:
                c60.s(this.f39317b, tLObject);
                return;
        }
    }
}
