package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rh0 implements Runnable {
    public final int f39519a;
    public final di0 f39520b;
    public final TLRPC.TL_error f39521c;
    public final TLObject d;

    public rh0(di0 di0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f39519a = i10;
        this.f39520b = di0Var;
        this.f39521c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f39519a) {
            case 0:
                di0 di0Var = this.f39520b;
                di0Var.getNotificationCenter().doOnIdle(new rh0(di0Var, this.f39521c, this.d, 1));
                return;
            default:
                di0.V(this.f39520b, this.f39521c, this.d);
                return;
        }
    }
}
