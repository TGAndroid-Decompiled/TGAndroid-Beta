package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vg0 implements Runnable {
    public final int f42246a;
    public final ih0 f42247b;
    public final TLRPC.TL_error f42248c;
    public final TLObject d;

    public vg0(ih0 ih0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f42246a = i10;
        this.f42247b = ih0Var;
        this.f42248c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42246a) {
            case 0:
                ih0 ih0Var = this.f42247b;
                ih0Var.getNotificationCenter().doOnIdle(new vg0(ih0Var, this.f42248c, this.d, 1));
                return;
            default:
                ih0.V(this.f42247b, this.f42248c, this.d);
                return;
        }
    }
}
