package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w91 implements RequestDelegate {
    public final int f38629a;
    public final ab1 f38630b;

    public w91(ab1 ab1Var, int i10) {
        this.f38629a = i10;
        this.f38630b = ab1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38629a) {
            case 0:
                ab1.U(this.f38630b, tLObject);
                return;
            default:
                ab1.V(this.f38630b, tLObject);
                return;
        }
    }
}
