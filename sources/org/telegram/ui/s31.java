package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s31 implements RequestDelegate {
    public final int f51094a;
    public final z41 f51095b;

    public s31(z41 z41Var, int i7) {
        this.f51094a = i7;
        this.f51095b = z41Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51094a) {
            case 0:
                z41.a0(this.f51095b, tLObject);
                return;
            default:
                z41.Z(this.f51095b, tLObject);
                return;
        }
    }
}
