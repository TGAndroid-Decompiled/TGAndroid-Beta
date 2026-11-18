package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v31 implements RequestDelegate {
    public final int f52671a;
    public final c51 f52672b;

    public v31(c51 c51Var, int i7) {
        this.f52671a = i7;
        this.f52672b = c51Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52671a) {
            case 0:
                c51.a0(this.f52672b, tLObject);
                return;
            default:
                c51.Z(this.f52672b, tLObject);
                return;
        }
    }
}
