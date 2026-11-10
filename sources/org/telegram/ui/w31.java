package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w31 implements RequestDelegate {
    public final int f50891a;
    public final e51 f50892b;

    public w31(e51 e51Var, int i7) {
        this.f50891a = i7;
        this.f50892b = e51Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50891a) {
            case 0:
                e51.a0(this.f50892b, tLObject);
                return;
            default:
                e51.Z(this.f50892b, tLObject);
                return;
        }
    }
}
