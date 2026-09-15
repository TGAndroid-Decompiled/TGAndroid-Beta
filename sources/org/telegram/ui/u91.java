package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u91 implements RequestDelegate {
    public final int f37917a;
    public final ya1 f37918b;

    public u91(ya1 ya1Var, int i10) {
        this.f37917a = i10;
        this.f37918b = ya1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37917a) {
            case 0:
                ya1.U(this.f37918b, tLObject);
                return;
            default:
                ya1.V(this.f37918b, tLObject);
                return;
        }
    }
}
