package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v91 implements RequestDelegate {
    public final int f38391a;
    public final za1 f38392b;

    public v91(za1 za1Var, int i10) {
        this.f38391a = i10;
        this.f38392b = za1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38391a) {
            case 0:
                za1.U(this.f38392b, tLObject);
                return;
            default:
                za1.V(this.f38392b, tLObject);
                return;
        }
    }
}
