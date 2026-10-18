package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wg0 implements Runnable {
    public final int f42842a;
    public final jh0 f42843b;
    public final TLRPC.TL_error f42844c;
    public final TLObject d;

    public wg0(jh0 jh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f42842a = i10;
        this.f42843b = jh0Var;
        this.f42844c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42842a) {
            case 0:
                jh0 jh0Var = this.f42843b;
                jh0Var.getNotificationCenter().doOnIdle(new wg0(jh0Var, this.f42844c, this.d, 1));
                return;
            default:
                jh0.V(this.f42843b, this.f42844c, this.d);
                return;
        }
    }
}
