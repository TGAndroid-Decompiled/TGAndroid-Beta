package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w91 implements RequestDelegate {
    public final int f38624a;
    public final ab1 f38625b;

    public w91(ab1 ab1Var, int i10) {
        this.f38624a = i10;
        this.f38625b = ab1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38624a) {
            case 0:
                ab1.U(this.f38625b, tLObject);
                return;
            default:
                ab1.V(this.f38625b, tLObject);
                return;
        }
    }
}
