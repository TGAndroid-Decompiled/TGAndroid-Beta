package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg0 implements Runnable {
    public final int f43134a;
    public final kh0 f43135b;
    public final TLRPC.TL_error f43136c;
    public final TLObject d;

    public xg0(kh0 kh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f43134a = i10;
        this.f43135b = kh0Var;
        this.f43136c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f43134a) {
            case 0:
                kh0 kh0Var = this.f43135b;
                kh0Var.getNotificationCenter().doOnIdle(new xg0(kh0Var, this.f43136c, this.d, 1));
                return;
            default:
                kh0.V(this.f43135b, this.f43136c, this.d);
                return;
        }
    }
}
