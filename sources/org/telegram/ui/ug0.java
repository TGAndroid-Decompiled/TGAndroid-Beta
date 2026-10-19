package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ug0 implements Runnable {
    public final int f41971a;
    public final hh0 f41972b;
    public final TLRPC.TL_error f41973c;
    public final TLObject d;

    public ug0(hh0 hh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f41971a = i10;
        this.f41972b = hh0Var;
        this.f41973c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f41971a) {
            case 0:
                hh0 hh0Var = this.f41972b;
                hh0Var.getNotificationCenter().doOnIdle(new ug0(hh0Var, this.f41973c, this.d, 1));
                return;
            default:
                hh0.V(this.f41972b, this.f41973c, this.d);
                return;
        }
    }
}
