package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf0 implements RequestDelegate {
    public final int f41081a;
    public final ig0 f41082b;

    public rf0(ig0 ig0Var, int i10) {
        this.f41081a = i10;
        this.f41082b = ig0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41081a) {
            case 0:
                org.telegram.messenger.i0.g3(new wf0(this.f41082b, tL_error, tLObject, 0));
                return;
            default:
                org.telegram.messenger.i0.g3(new if0(1, this.f41082b, tL_error));
                return;
        }
    }
}
