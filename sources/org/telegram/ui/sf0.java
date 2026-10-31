package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sf0 implements RequestDelegate {
    public final int f41504a;
    public final kg0 f41505b;

    public sf0(kg0 kg0Var, int i10) {
        this.f41504a = i10;
        this.f41505b = kg0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41504a) {
            case 0:
                org.telegram.messenger.i0.g3(new yf0(this.f41505b, tL_error, tLObject, 0));
                return;
            default:
                org.telegram.messenger.i0.g3(new uf0(0, this.f41505b, tL_error));
                return;
        }
    }
}
