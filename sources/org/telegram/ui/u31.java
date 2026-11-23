package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u31 implements RequestDelegate {
    public final int f52525a;
    public final b51 f52526b;

    public u31(b51 b51Var, int i7) {
        this.f52525a = i7;
        this.f52526b = b51Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52525a) {
            case 0:
                b51.a0(this.f52526b, tLObject);
                return;
            default:
                b51.Z(this.f52526b, tLObject);
                return;
        }
    }
}
