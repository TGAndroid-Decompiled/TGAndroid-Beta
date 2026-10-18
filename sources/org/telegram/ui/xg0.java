package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg0 implements Runnable {
    public final int f43154a;
    public final kh0 f43155b;
    public final TLRPC.TL_error f43156c;
    public final TLObject d;

    public xg0(kh0 kh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f43154a = i10;
        this.f43155b = kh0Var;
        this.f43156c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f43154a) {
            case 0:
                kh0 kh0Var = this.f43155b;
                kh0Var.getNotificationCenter().doOnIdle(new xg0(kh0Var, this.f43156c, this.d, 1));
                return;
            default:
                kh0.V(this.f43155b, this.f43156c, this.d);
                return;
        }
    }
}
