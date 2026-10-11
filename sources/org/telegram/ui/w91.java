package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w91 implements RequestDelegate {
    public final int f43310a;
    public final ab1 f43311b;

    public w91(ab1 ab1Var, int i10) {
        this.f43310a = i10;
        this.f43311b = ab1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43310a) {
            case 0:
                ab1.U(this.f43311b, tLObject);
                return;
            default:
                ab1.V(this.f43311b, tLObject);
                return;
        }
    }
}
