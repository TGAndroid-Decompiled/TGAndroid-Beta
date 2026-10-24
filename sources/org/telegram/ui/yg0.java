package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg0 implements Runnable {
    public final int f43846a;
    public final lh0 f43847b;
    public final TLRPC.TL_error f43848c;
    public final TLObject d;

    public yg0(lh0 lh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f43846a = i10;
        this.f43847b = lh0Var;
        this.f43848c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f43846a) {
            case 0:
                lh0 lh0Var = this.f43847b;
                lh0Var.getNotificationCenter().doOnIdle(new yg0(lh0Var, this.f43848c, this.d, 1));
                return;
            default:
                lh0.V(this.f43847b, this.f43848c, this.d);
                return;
        }
    }
}
