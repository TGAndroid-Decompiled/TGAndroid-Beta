package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s31 implements RequestDelegate {
    public final int f51090a;
    public final z41 f51091b;

    public s31(z41 z41Var, int i7) {
        this.f51090a = i7;
        this.f51091b = z41Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51090a) {
            case 0:
                z41.a0(this.f51091b, tLObject);
                return;
            default:
                z41.Z(this.f51091b, tLObject);
                return;
        }
    }
}
