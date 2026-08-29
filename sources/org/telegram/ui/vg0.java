package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vg0 implements Runnable {
    public final int f43589a;
    public final hh0 f43590b;
    public final TLRPC.TL_error f43591c;
    public final TLObject d;

    public vg0(hh0 hh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f43589a = i10;
        this.f43590b = hh0Var;
        this.f43591c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f43589a) {
            case 0:
                hh0 hh0Var = this.f43590b;
                hh0Var.getNotificationCenter().doOnIdle(new vg0(hh0Var, this.f43591c, this.d, 1));
                return;
            default:
                hh0.V(this.f43590b, this.f43591c, this.d);
                return;
        }
    }
}
