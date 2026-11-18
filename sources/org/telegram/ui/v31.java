package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v31 implements RequestDelegate {
    public final int f52686a;
    public final c51 f52687b;

    public v31(c51 c51Var, int i7) {
        this.f52686a = i7;
        this.f52687b = c51Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52686a) {
            case 0:
                c51.a0(this.f52687b, tLObject);
                return;
            default:
                c51.Z(this.f52687b, tLObject);
                return;
        }
    }
}
