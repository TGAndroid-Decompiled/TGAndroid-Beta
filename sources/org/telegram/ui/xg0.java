package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg0 implements Runnable {
    public final int f45769a;
    public final jh0 f45770b;
    public final TLRPC.TL_error f45771c;
    public final TLObject d;

    public xg0(jh0 jh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f45769a = i10;
        this.f45770b = jh0Var;
        this.f45771c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f45769a) {
            case 0:
                jh0 jh0Var = this.f45770b;
                jh0Var.getNotificationCenter().doOnIdle(new xg0(jh0Var, this.f45771c, this.d, 1));
                return;
            default:
                jh0.W(this.f45770b, this.f45771c, this.d);
                return;
        }
    }
}
