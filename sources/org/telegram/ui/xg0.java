package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg0 implements Runnable {
    public final int f45766a;
    public final jh0 f45767b;
    public final TLRPC.TL_error f45768c;
    public final TLObject d;

    public xg0(jh0 jh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f45766a = i10;
        this.f45767b = jh0Var;
        this.f45768c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f45766a) {
            case 0:
                jh0 jh0Var = this.f45767b;
                jh0Var.getNotificationCenter().doOnIdle(new xg0(jh0Var, this.f45768c, this.d, 1));
                return;
            default:
                jh0.W(this.f45767b, this.f45768c, this.d);
                return;
        }
    }
}
